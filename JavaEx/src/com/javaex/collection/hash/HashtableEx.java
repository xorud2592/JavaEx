package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
	
		System.out.println("MAP: " + map);
		
		ClassRoom room = map.get("202");
		System.out.println("202 강의실: " +room);
		
		map.put("202",  new ClassRoom("Linux", "R202"));
		System.out.println("MAP: " + map);

		System.out.println("map has 202 key ? " + map.containsKey("202"));
		
		System.out.println("map has subject Java? " + map.containsValue(new ClassRoom("Java")));
	}
}
