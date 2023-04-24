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

	public void CreateList(Object data) {

		Node newNode = new Node(data); 
		System.out.println(newNode.data + " ");
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("welcome to LinkedList Problem");
		list.CreateList(56);
		list.CreateList(30);
		list.CreateList(70);

	}

}
