package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.println(name + ": 아뵤~");
	}
	
}
