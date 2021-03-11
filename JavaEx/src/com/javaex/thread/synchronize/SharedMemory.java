package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
