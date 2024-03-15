package com.rabu.java.main;

import com.rabu.java.vo.Node;

public class LinkedList {

	Node head = null;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {

		Node node = new Node();
		node.data = data;

		if (index == 0) {
			insertAtFirst(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				if (n.next != null) {
					n = n.next;
				}
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				if (n.next != null) {
					n = n.next;
				}
			}
			Node n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
