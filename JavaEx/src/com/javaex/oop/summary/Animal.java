package com.javaex.oop.summary;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age)
	{
		this(name);
		this.age = age;
	}
	
	public void eat()
	{
		System.out.println(name + "is eating....");
	}
	
	public abstract void say();
}
