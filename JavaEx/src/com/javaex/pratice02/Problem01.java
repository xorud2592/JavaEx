package com.javaex.pratice02;

public class Problem01 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int total = 0, count = 0;
		
		for( int num :data)
		{
			if(num % 3 == 0)
			{
				total += num;
				count++;
			}
		}
        System.out.println("주어진 배열에서 3의 배수의 합 => " + total);
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
	}

}
