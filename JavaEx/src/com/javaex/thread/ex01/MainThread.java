package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		thread.start();
		
		
		
		for (char ch ='A'; ch<= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
