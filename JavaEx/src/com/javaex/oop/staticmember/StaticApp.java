package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트:" + s1.refCount);
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		s1 = null;
		System.out.println("s1 해제");
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		System.gc();
		try {
			Thread.sleep(1000);
			System.out.println("참조카운트:" + StaticEx.refCount);
		}catch(Exception e)
		{
			
		}
	}

}
