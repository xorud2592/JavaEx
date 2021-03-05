package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill,Flyable{
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know kungfu!");
	}
	
	@Override
	public void fly() {
		System.out.println(name + ": I belive i can fly");
	}
}
