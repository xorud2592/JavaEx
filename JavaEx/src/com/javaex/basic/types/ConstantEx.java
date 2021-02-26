package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SPEED_LIMIT = 110;
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도를 초과 였습니까? " + b1);
		
		System.out.println("제한속도는" + SPEED_LIMIT + "입니다");
	}

}
