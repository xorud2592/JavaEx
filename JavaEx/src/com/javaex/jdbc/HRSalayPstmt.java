package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HRSalayPstmt {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("최소급여: ");
		int minSalary = scanner.nextInt();
		System.out.print("최대급여: ");
		int maxSalary = scanner.nextInt();
		
		if(minSalary > maxSalary) {
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}
		
		scanner.close();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, "hr", "hr");
			
			String sql = "SELECT first_name, last_name, salary " +
					"FROM employees WHERE salary BETWEEN ? AND ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s %s, %d%n",
								rs.getString("first_name"), rs.getString("last_name"),
								rs.getInt(3));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
