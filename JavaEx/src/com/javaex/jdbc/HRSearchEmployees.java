package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("검색할 사원 이름을 입력하세요: ");
			String search = sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, "hr", "hr");
			
			String sql = "SELECT first_name, last_name, " +
			"email, phone_number, hire_date " +
			"FROM employees " +
			"WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + search + "%");
			pstmt.setString(2, "%" + search + "%");
			
			rs= pstmt.executeQuery(sql);
//			String sql = "SELECT first_name, last_name, " +
//					"email, phone_number, hire_date " +
//					"FROM employees " +
//					"WHERE lower(first_name) LIKE '%" + search + "%' OR  "+
//					"lower(last_name) LIKE '%" + search + "%'";
//			stmt = conn.createStatement();
//			
//			rs = stmt.executeQuery(sql);
			
			System.out.println(search + "검색");
			while (rs.next()) {
				System.out.printf("%s %s: %s, %s, %s%n", 
						rs.getString(1), rs.getString(2),
						rs.getString(2),
						rs.getString("phone_number"), rs.getString("hire_date"));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
