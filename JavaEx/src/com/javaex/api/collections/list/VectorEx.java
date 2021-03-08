package com.javaex.api.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println("v: " + v);
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

		v.addElement(11);
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

		v.insertElementAt(7, 5);
		System.out.println("v: " + v);

		System.out.println("5번 인덱스의 객체: " + v.elementAt(5));

		int index = v.indexOf(6);
		System.out.println("index of 6: " + index);
		index = v.indexOf(0);
		System.out.println("index of 0: " + index);

		System.out.println("v contains 10 ? " + v.contains(10));

		System.out.println("v: " + v);
		v.removeElement(7);
		System.out.println("v: " + v);

		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		for (Integer item: v) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer item = e.nextElement();
			System.out.print(item + "");
		}
		System.out.println();
		
		v.clear();
		System.out.println("v: " + v);
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
	}
}
