package com.rabu.java.main;

import java.util.Random;

public class SinglyLLRunner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
//		Random rand = new Random();
//		
//		for(int i=0; i<50; i++) {
//			list.insert(rand.nextInt(100));
//		}
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		
		list.insertAtFirst(100);
		
		list.insertAt(3, 90);
		
		list.deleteAt(3);
		
		list.show();
		
	}

}
