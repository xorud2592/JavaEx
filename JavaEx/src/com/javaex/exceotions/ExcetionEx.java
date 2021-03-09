package com.javaex.exceotions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetionEx {

	public static void main(String[] args) {

//		arithExceptionEx();
//		arrayExceptionEx();
//		nullPointerExceptionEx();
		throwsExceptEx();
		System.out.println("End of Code!");
	}

	private static void throwsExceptEx() {
		ThrowsExcept except = new ThrowsExcept();
		try {
//		except.executeRuntime();
			except.divide(100, 0);
		}catch (CustomArithmeticException e) {
			System.err.println("메시지: " + e.getMessage());
			System.err.println("나누어지는 수: " + e.getNum1());
			System.err.println("나누는 수: " + e.getNum2());
		}
		catch (RuntimeException e) {
			System.err.println("호출된 메서드에서 unchecked 예외 발생!");
			System.err.println("메시지: " + e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외 처리 완료!");
		}
//		try {
//			except.executeChecked();
//		}catch(IOException e) {
//			System.err.println("효출된 메서드에서 checked 예외 발생!");
//			System.err.println("메시지: " + e.getMessage());
//		}
	}
	private static void nullPointerExceptionEx() {
		String str = new String("Hello");
		
		str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("에러 메시지: " + e.getMessage());
			System.err.println("발생한 예외: " + e.getClass().getSimpleName());
		}
	}

	private static void arrayExceptionEx() {
		int[] intArray = new int[] { 3, 6, 9};
		try {
		System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("에러 메시지: " + e.getMessage());
			System.err.println("발생한 예외: " + e.getClass().getSimpleName());
		}
	}

	private static void arithExceptionEx() {
		double result = 0;
		int num;
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");

		try {
			num = scanner.nextInt();
			result = 100 / num;
		}catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다.");
		} 
		catch (ArithmeticException e) {
			System.out.println("0 으로는 나눌수없어요");
			System.out.println("메세지: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		System.out.println("결과: " + result);
		scanner.close();
	}
}
