package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println("p, p2는 같은 객체? " + (p == p2));
		System.out.println("p와 p2의 값이 같은가? " + p.equals(p2));
		
		
	}

}
