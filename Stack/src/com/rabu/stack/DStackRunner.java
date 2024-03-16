package com.rabu.stack;

public class DStackRunner {

	public static void main(String[] args) {
		Dstack stack = new Dstack();

		System.out.println("stack is empty ? " + stack.isEmpty());

		stack.push(10);
		stack.show();
		stack.push(20);
		stack.show();
		stack.push(30);
		stack.show();
		stack.push(40);
		stack.show();
		stack.push(50);
		stack.show();
		stack.push(60);

		System.out.println("Data popped --> " + stack.pop());
		stack.show();

		// Fetching the element at the head of the Stack
		System.out.println("Data peeked --> " + stack.peek());

		System.out.println("Data popped --> " + stack.pop());
		stack.show();

		System.out.println("stack is empty ? " + stack.isEmpty());
		stack.show();

		System.out.println("Data popped --> " + stack.pop());
		stack.show();
		
		System.out.println("Data popped --> " + stack.pop());
		stack.show();
	}

}
