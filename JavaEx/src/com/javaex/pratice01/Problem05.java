package com.javaex.pratice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 5;
		int max = 0;
		for(int numCount=1; numCount<=count;numCount++)
		{
			System.out.print("숫자 : ");
			int num = scanner.nextInt();
			max = num > max ? num : max;
		}
		System.out.println("최대값은 " + max + "입니다.");
	}
}
