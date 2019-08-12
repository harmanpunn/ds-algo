package ds.circularlinkedlist;


public class App {

	public static void main(String[] args) {

		CircularLinkedList circularList = new CircularLinkedList();
		circularList.insertFirst(10);
		circularList.insertFirst(20);
		circularList.insertFirst(30);
		circularList.insertFirst(40);
		circularList.insertFirst(50);
		
		circularList.insertLast(100);
		circularList.insertLast(110);
		circularList.displayList();
	}

}
