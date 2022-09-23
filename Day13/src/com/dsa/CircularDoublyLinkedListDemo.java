package com.dsa;

public class CircularDoublyLinkedListDemo {
	static Node head;

	// Doubly linked list node definition
	static class Node {
		int data;
		Node next;
		Node prev;
	};

	// Function to insert node in the list
	static void addNode(int value) {
		// List is empty so create a single node first
		if (head == null) {
			Node new_node = new Node();
			new_node.data = value;
			new_node.next = new_node.prev = new_node;
			head = new_node;
			return;
		}

		// find last node in the list if list is not empty
		Node last = (head).prev; // previous of head is the last node

		// create a new node
		Node new_node = new Node();
		new_node.data = value;

		// next of new_node will point to head since list is circular
		new_node.next = head;

		// similarly previous of head will be new_node
		(head).prev = new_node;

		// change new_node=>prev to last
		new_node.prev = last;

		// Make new node next of old last
		last.next = new_node;
	}

	static void printNodes() {
		Node temp = head;
		// traverse in forward direction starting from head to print the list
		while (temp.next != head) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.printf("%d ", temp.data);

		// traverse in backward direction starting from last node
		System.out.printf("\nCircular doubly linked list travesed backward: \n");
		Node last = head.prev;
		temp = last;
		while (temp.prev != last) {
			System.out.printf("%d ", temp.data);
			temp = temp.prev;
		}
		System.out.printf("%d ", temp.data);
	}

	public static void main(String[] args) {
		// the empty list
		Node l_list = null;

		// add nodes to the list
		addNode(40);
		addNode(50);
		addNode(60);
		addNode(70);
		addNode(80);

		// print the list
		System.out.printf("Circular doubly linked list: ");
		printNodes();
	}
}
