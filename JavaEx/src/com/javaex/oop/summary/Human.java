package com.javaex.oop.summary;

public class Human extends Animal{
	public Human(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("안녕 내이름은 " + name + "이야.");
	}
	
	
}
