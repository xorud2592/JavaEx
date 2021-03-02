package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consoleOutputEx();
		consoleInpuitEx();
	}

	private static void consoleInpuitEx()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름은? ");
		String name = scanner.next();
		System.out.println("나이는? ");
		int age = scanner.nextInt();
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age +"입니다");
		scanner.close();
	}
	private static void consoleOutputEx() {
		// TODO Auto-generated method stub
		System.out.print("Hello ");
		System.out.println("Java");
		System.out.println("NewLine");
		
		System.out.println("Hello \nJava");
		System.out.println("Hello \t\tJava");
		System.out.println("Hello \"Java\"");
		
		
		String filePath = "D:\\myfolder\\myfile.txt";
		System.out.println(filePath);
	}

}
