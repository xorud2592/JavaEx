package com.javaex.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithOperEx();
		//logicalOperEx();
		//bitOperEx();
		//bitShiftEx();
		conditionalOperEx();
	}

	private static void conditionalOperEx() {
		int a = 10;
		
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "는 짝수? " + result);
		
		int score = 85;
		
		String message = score >= 80 ? "Good" : score > 50 ? "Pass" : "Fail";
		System.out.println("Score: " + ", Result: " + message);
	}

	private static void bitShiftEx() {
		// TODO Auto-generated method stub
			
		int val = 1;
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val<< 1));
		System.out.println(Integer.toBinaryString(val<< 2));
	
		val = 0b1000;
		
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 1));
		
	}

	private static void bitOperEx() {
		int b1 = 0b1101;
		int b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		
		int result = b1 & b2;
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2;
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1;
		System.out.println(Integer.toBinaryString(result));
		
		
	}

	private static void logicalOperEx()
	{
		int a = 7;
		int b = 3;
		
		System.out.println("a > b ? " + (a > b));
		System.out.println("a equals b ? " + (a == b));
		System.out.println("a not equals b ? " + (a != b));
		
		int val = 5;
		
		boolean r1 = val > 0;
		boolean r2 = val < 10;
		boolean r1andr2 = r1 &&  r2;
		
		System.out.println("r1 && r2 = " + r1andr2);
		
		r1 = val <= 0;
		r2 = val >= 10;
		boolean r1orr2 = r1 || r2;
		System.out.println("r1 || r2 = " + r1orr2);
		
		boolean rNot = !r1orr2;
		System.out.println("r1orr2 논리의 부정: " + rNot);
		
	}
	
	private static void arithOperEx()
	{
		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		System.out.println(-1 * a);
		
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println((float)a / (float)b);
		
		System.out.println((float)a / b);
		
		int c = 10;
		
		System.out.println("후위증감");
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		
		c = 10;
		System.out.println("전위증감");
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		
		int d  = 10;
	//	int e = 0;
		
		//System.out.println(4 / 0);
		System.out.println((float)d / 0);
		
		System.out.println("10.0 / 0은 유한수?" + Double.isFinite((float)d / 0));
		
		System.out.println(0.0 / 0.0);
		System.out.println("0.0 / 0 is Nan?" + Double.isNaN(0.0 / 0.0));
		
		System.out.println(10.0 / 0 + 10);
		System.out.println(0.0 / 0 + 10);
		
		a += b;
		
	}
}
