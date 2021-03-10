package com.javaex.thread.ex01;

public class DigitThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<= 30;i++) {
			System.out.printf("%s: %d%n", getName(), i);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
