package com.linkedlist.ds;

public class LinkedList {
	
	Node head; 

	class Node {
		Object data;
		Node next;

		Node(Object data) {

			this.data = data;
		}

	}

	public void addFirst(Object data) {

		Node newNode = new Node(data); 
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null) {
			head = newNode;
		}

		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			if (temp.next != null)
				System.out.print(temp.data + " -> ");
			else
				System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("welcome to LinkedList Problem");
		System.out.println("Adding Nodes At First");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
		System.out.println();
		System.out.println("Adding Nodes At last");
		list.addLast(56);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(70);
		list.display();
	}

}
