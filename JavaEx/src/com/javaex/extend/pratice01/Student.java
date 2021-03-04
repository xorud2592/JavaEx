package com.javaex.extend.pratice01;

public class Student extends Person {
	private String schoolName;

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.printf("출신고등학교는 %s입니다.%n", schoolName);
	}
}
