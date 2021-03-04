package com.javaex.pratice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int money = 0;
		boolean end = false;
		while(!end)
		{
			System.out.println();
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int select = scanner.nextInt();
			switch(select)
			{
				case 1:
					money = deposit(scanner, money);
					break;
				case 2:
					money = withdraw(scanner, money);
					break;
				case 3:
					System.out.println("잔고액>" + money);
					break;
				case 4:
					end = true;
					break;
				default:
					System.out.println("다시입력해주세요");
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

	private static int withdraw(Scanner scanner, int money) {
		System.out.print("출금액>");
		int subMoney = scanner.nextInt();
		return money - subMoney;
	}

	private static int deposit(Scanner scanner, int money) {
		System.out.print("예금액>");
		int addMoney = scanner.nextInt();
		return money + addMoney;
	}

}
