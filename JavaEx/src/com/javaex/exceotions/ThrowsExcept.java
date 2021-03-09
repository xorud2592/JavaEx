package com.javaex.exceotions;

import java.io.IOException;

public class ThrowsExcept {
	public void executeChecked() throws IOException {
		System.err.println("강체 체크드 예외 발생");
		throw new IOException("강제 예외");
	}
	
	public void executeRuntime()  {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");
	}
	
	public double divide(int num1, int num2) {
		double result;
		try {
			result = num1/ num2;;
		} catch (ArithmeticException e) {
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		return 0;
	}
}
