package ds.doublylinkedlist;

import java.util.List;

//import org.apache.commons.lang.StringEscapeUtils;
//import org.apache.commons.lang.StringUtils;


public class App {

	public static void main(String[] args) {

		DoubleLinkedList list = new DoubleLinkedList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.insertLast(100);
		list.insertAfter(20, 25);
		list.insertAfter(100, 110);
		list.deleteKey(20);
		list.deleteLast();
	
		list.displayForward();
		list.displayBackward();
		
		String name = "To start counting your letters, simply write or paste the text into the text area and Count characters Adding more charactes.";
		String name1 = "//To start counting your letters, simply write or paste the text into the text area and Count ch...";
		System.out.println(name.length());
		
		//System.out.println(StringEscapeUtils.escapeJavaScript(StringUtils.abbreviate(name, 100)));
		System.out.println(name1.length());
		//System.out.println(StringEscapeUtils.escapeJavaScript(StringUtils.abbreviate(name, 97))	);
		
	}

}
