package com.rabu.stack;

public class Dstack {
	
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (size() == stack.length) {
			expand();
		}
		stack[top] = data;
		top++;
	}

	private void expand() {
		int[] newStack = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, capacity);
		stack = newStack;
		capacity *= 2;
	}

	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty, you can't pop the data ");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		
		return data;
	}
	
	private void shrink() {
		int length = size();
		if(length <= (capacity/2)/2) {
			capacity/= 2;
		}
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
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
