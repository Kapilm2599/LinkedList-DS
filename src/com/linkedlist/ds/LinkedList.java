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
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();

	}

}
