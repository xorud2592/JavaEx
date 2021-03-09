package com.javaex.api.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		listClassEx();
	}

	private static void listClassEx() {
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		System.out.println("list: " + lst);
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
			
		System.out.println("lst: " + lst);
		
		lst.add(2, "cs");
		System.out.println("lst: " + lst);
		
		lst.add("Java");
		System.out.println("lst: " + lst);
		
		System.out.println("2번 인덱스: " + lst.get(2));
		
		for ( String item: lst) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {	
			String item = it.next();
			System.out.print(item + " ");
		}
		System.out.println();
		
		lst.remove(2);
		lst.remove("Python");
		System.out.println("lst: " + lst);
		
		int position = lst.indexOf("Java");
		System.out.println("lst setch: " + position );
		position = lst.indexOf("linux");
		System.out.println("lst setch: " + position );
		
		
	}

}
