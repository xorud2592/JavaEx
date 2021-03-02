package com.javaex.pratice01;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int count = 1; count <= 9; count++)
		{
			for(int num=2; num<=9; num++)
			{
				System.out.print(num + "*" + count + "=" + (num * count) + "\t");
			}
			System.out.println();
		}
	}

}
