package com.javaex.api.collections.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		System.out.println("STACK: " + stack);

		for (int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("STACK: " + stack);
		}

		System.out.println("PEEK:" + stack.peek());
		System.out.println("STACK: " + stack);

		Integer item = stack.pop();
		System.out.println("POP: " + item);
		System.out.println("STACK: " + stack);
		
		//while(!)
	}

}
