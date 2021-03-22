package com.javaex.jdbc;

import java.sql.*;

public class SelectTest {
	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, "hr", "hr");
			stmt = conn.createStatement();

			String sql = "SELECT department_id, department_name " + "FROM departments";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int deptId = rs.getInt(1);
				String deptName = rs.getString("department_name");

				System.out.printf("%d:%s%n", deptId, deptName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
