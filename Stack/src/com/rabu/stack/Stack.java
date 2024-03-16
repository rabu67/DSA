package com.rabu.stack;

public class Stack {

	int[] stack = new int[5];
	int top = 0;

	public void push(int data) {
		if (size() == stack.length) {
			System.out.println("Stack is full.. can't push the data " + data);
		} else {
			stack[top] = data;
			top++;
		}
	}

	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty, you can't pop the data ");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		
		return data;
	}
	
	public int peek() {
		return stack[top-1];
	}
	
	
	public int size() {
		return top;
	}
	
	public Boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
