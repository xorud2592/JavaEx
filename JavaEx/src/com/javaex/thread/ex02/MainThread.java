package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		thread.start();
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlpabetRunnable");
		thread2.start();
		
		try {
			thread.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MainThread 종료!");
		
	}

}
