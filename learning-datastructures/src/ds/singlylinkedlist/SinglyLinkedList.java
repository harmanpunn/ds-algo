package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//used to insert at the beginning
	public Node insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		
		return newNode;
	}
	
	public Node insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
		return newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
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
	
	public void deleteNode(Node node) {
		Node current = node;
		Node nextNode = current.next;
		current.data = nextNode.data;
		current.next = nextNode.next;
	}
}
