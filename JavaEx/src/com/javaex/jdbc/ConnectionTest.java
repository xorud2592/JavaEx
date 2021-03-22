package com.javaex.jdbc;

import java.sql.*;

public class ConnectionTest {
	private static String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String DBUSER = "hr";
	private static String DBPASS = "hr";
	
	public static void main(String args[]) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			System.out.println("접속정보: " + conn);
			System.out.println("연결 성공!");
		}catch (ClassNotFoundException e){
			System.err.println("드라이버 로드 실패!");
		}catch(SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
