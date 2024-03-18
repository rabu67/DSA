package com.rabu.queue;

public class Queue {

	int n = 5;

	int[] queue = new int[n];
	int rear;
	int front;
	int size;

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full, can't add the elem --> " + data);
		} else {
			queue[rear] = data;
			rear = (rear + 1) % n;
			size++;
		}
	}

	public int deQueue() {
		int data = queue[front];
		if (isEmpty()) {
			System.out.println("Can't dequeue the elements, since queue is empty");
		} else {
			front = (front + 1) % n;
			size--;
		}
		return data;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == n;
	}

	public void show() {
		System.out.println("Elements :");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(i + front) % n] + " ");
		}
	}

}
