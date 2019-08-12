package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList singlyList = new SinglyLinkedList();
		
		singlyList.insertFirst(140);
		singlyList.insertLast(100);
		Node node110 = singlyList.insertLast(110);
		singlyList.insertLast(120);
		singlyList.insertLast(130);
		singlyList.displayList();
		
		singlyList.deleteNode(node110);
		
		singlyList.displayList();
		
	}

}
