package com.javaex.api.collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			queue.offer(i);
			System.out.println("Queue: " + queue);
		}

		int item = queue.peek();
		System.out.println("PEEK: " + item);
		System.out.println("QUEUE: " + queue);
		item = queue.poll();
		System.out.println("poll: " + item);
		System.out.println("QUEUE: " + queue);

		while (!queue.isEmpty()) {
			System.out.println("poll: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
	}

}
