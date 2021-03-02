package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifEx();
		//ifElseEx();
		//ifPractice();
		//switchEx();
		//switchEx2();
		//switchEx3();
		//ex1();
		ex2();
	}

	private static void ex2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수을 입력하세요 : ");
		int num = scanner.nextInt();
		
		switch (num / 10)
		{
		case 9:
			System.out.println("R101입니다.");
			break;
		case 2:
			System.out.println("R202입니다.");
			break;
		case 3:
			System.out.println("R303입니다.");
			break;
		case 4:
			System.out.println("R404입니다.");
			break;
		
		default:
			System.out.println("관리자에게 문의하세요");
		}
		scanner.close();
	}

	private static void ex1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = scanner.nextInt();
		if(num % 3 == 0 && num != 0)
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		scanner.close();
	}

	private static void switchEx3() {
		
		String day = "TUE";
		String message;
		
		switch(day)
		{
		case "SUN":
			message = "일요일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "SAT":
			message = "주말";
			break;
		default:
			message = "?";
		}
		System.out.println(day + "에는 " + message);
	}

	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = scanner.nextInt();
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
			case 2:
				System.out.println(month + "월은 28일입니다.");
				break;
		default:
			System.out.println("?");
		}
		scanner.close();
	}

	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬");
		System.out.println("과목번호: ");
		int num = scanner.nextInt();
		
		switch (num)
		{
		case 1:
			System.out.println("R101입니다.");
			break;
		case 2:
			System.out.println("R202입니다.");
			break;
		case 3:
			System.out.println("R303입니다.");
			break;
		case 4:
			System.out.println("R404입니다.");
			break;
		
		default:
			System.out.println("관리자에게 문의하세요");
		}
		scanner.close();
	}

	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬");
		System.out.println("과목번호: ");
		int num = scanner.nextInt();
		if(num == 1)
		{
			System.out.println("R101호 입니다");
		}
		else if(num == 2)
		{
			System.out.println("R202호 입니다");
		}
		else if(num == 3)
		{
			System.out.println("R303호 입니다");
		}
		else if(num == 4)
		{
			System.out.println("R404호 입니다");
		}
		else
		{
			System.out.println("상담원에게 문의 하세요");
		}	
		scanner.close();
	}

	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = scanner.nextInt();
		
//		if (num > 0)
//		{
//			System.out.println("양수입니다.");
//		}
//		else if (num < 0)
//		{
//			System.out.println("음수입니다.");
//		}
//		else
//		{
//			System.out.println("0입니다.");
//		}
		
		if (num == 0)
		{
			System.out.println("0입니");
		}
		else
		{
			if (num > 0)
			{
				System.out.println("양수입니다.");
			}
			else if (num < 0)
			{
				System.out.println("음수입니다.");
			}
		}
		scanner.close();
	}

	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		if(score >= 60)
		{
			System.out.println("합격입니다. ");
		}
		else
		{
			System.out.println("불합격입니다");
		}
		
		scanner.close();
	}

}
