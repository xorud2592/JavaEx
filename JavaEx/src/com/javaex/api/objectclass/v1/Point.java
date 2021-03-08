package com.javaex.api.objectclass.v1;

public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	 객체 출력 or 문자열과 연결될 때 반환되는 문자열 

	@Override
	public String toString() {
		return String.format("Point(x=%d, y=%d)", x, y);
	}
}
