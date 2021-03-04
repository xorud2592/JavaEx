package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;
	public static String classVar;
	
	public String instanceVar;
	
	static
	{
		refCount = 0;
		classVar = "클래스 변수";
		System.out.println("=> Static Block");
	}
	
	public StaticEx()
	{
		refCount++;
		System.out.println("=> Instance 생성");
		System.out.println("=> 참조 Count: " + refCount);
		instanceVar = "";
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("소멸자 호");
		super.finalize();
	}
}
