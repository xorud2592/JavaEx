package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		explicitCastingEx();
		implicitCastingEx();
	}
	private static void explicitCastingEx()
	{
		double d = 1234.567;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		byte b = (byte)l;
		System.out.println(b);
	}
	
	private static void implicitCastingEx()
	{
		byte b = 25;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
	}

}
