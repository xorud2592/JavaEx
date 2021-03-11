package com.javaex.thread.ex02;

public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		for (char ch ='A'; ch<= 'Z'; ch++) {
			System.out.println(Thread.currentThread().getName() + ch);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
