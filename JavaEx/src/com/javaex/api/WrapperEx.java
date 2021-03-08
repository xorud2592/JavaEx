package com.javaex.api;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Float f = new Float(3.14159f);

		Character c = Character.valueOf('c');

		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf(3.14159f);
		Boolean b2 = Boolean.valueOf("false");
		
		Integer i3 = 10;
		
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		
		double d4 = i3.doubleValue();
		System.out.println("형변환: " + d4);
		
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println("i4 == i5 ? " + (i4 == i5));
		
		System.out.println("값의 비교(언박싱): " + (i4.intValue() == i5.intValue()));
		System.out.println("값의 비교(equals): " + i4.equals(i5));
	}
}
