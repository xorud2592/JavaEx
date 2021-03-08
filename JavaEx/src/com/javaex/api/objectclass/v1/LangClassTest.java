package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);

		System.out.println(p.getClass());
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.toString());
		System.out.println(p);

		System.out.println(p.hashCode());

		Point p2 = new Point(10, 10);
		Point p3 = p;
		
		System.out.println("p1 hachcode: " +p.hashCode());
		System.out.println("p2 hachcode: " +p2.hashCode());
		System.out.println("p3 hachcode: " +p3.hashCode());

		System.out.println("p1 hachcode == p2 hachcode ? " + (p.hashCode() == p2.hashCode()));
		System.out.println("p1 hachcode == p3 hachcode ? " + (p.hashCode() == p3.hashCode()));

	}

}
