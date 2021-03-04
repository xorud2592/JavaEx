package com.javaex.pratice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = scanner.nextInt();
		int sum = 0;
		for(int i = input%2; i<=input; i+=2)
		{
			sum+=i;
		}
		System.out.println("결과값: " + sum);
		scanner.close();
	}

}
