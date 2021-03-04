package com.javaex.pratice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean end = false;
		while(!end)
		{
			System.out.println("================================");
			System.out.println("\t[숫자맞추기게임 시작]");
			System.out.println("================================");
			int random = (int)(Math.random()*100+1);
			int input = 0;
			while(true)
			{
				System.out.print(">>");
				input = scanner.nextInt();
				if(input < random)
				{
					System.out.println("더 높게");
				}
				else if(input>random)
				{
					System.out.println("더 낮게");
				}
				else if(input == random)
				{
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			String yn = scanner.next();
			if (yn.equals("y"))
				end = true;
		}
		scanner.close();
	}

}
