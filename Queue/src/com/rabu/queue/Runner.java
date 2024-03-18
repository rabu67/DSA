package com.rabu.queue;

public class Runner {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);

		System.out.println("Dequeued ele --> " + queue.deQueue());
		System.out.println("Dequeued ele --> " + queue.deQueue());

		queue.enQueue(50);
		queue.enQueue(60);
		queue.enQueue(70);

		queue.show();
	}

}
