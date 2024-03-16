package com.rabu.javastack;

import java.util.Stack;

public class JavaStackRunner {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		System.out.println(stack.peek());
		for(int n: stack) {
			System.out.println(n+ " ");
		}
	}

}
