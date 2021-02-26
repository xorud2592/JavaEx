package com.javaex.basic.types;

public class IntLongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVar = 2021;
		
//		int intVar2 = 123456789012345;
		
		long longVar = 2021;
		long longVar2 = 123456789012345L;
		
		short s1 = 100;
		short s2 = 200;
		
		int result = s1 + s2;
		
		System.out.println(s1 + "+" + s2 + "=" + result);
		
		int bin, oct, hex;
		
		bin = 0b1100;
		oct = 072;
		hex = 0xFF;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}
