package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;  //newNode --> oldFirst
		first = newNode;
		
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; //the next value of the last node will point to new node
			last = newNode; //we made the new node we created be the last one in the list
		}
	}

	public int deleteFirst() {
		int temp = first.data;
		if(first.next == null) {
			last = null;
		}
		first = first.next; 
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	private boolean isEmpty() {
		return (first == null);
	}
}
