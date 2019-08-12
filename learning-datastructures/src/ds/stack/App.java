package ds.stack;


public class App {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		/*
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);*/
		
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
		}
		
		System.out.println(reverseString("ORACLE"));
	}
	
	public static String reverseString(String str) {
		Stack stack = new Stack(str.length());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			stack.push(c);
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}

}
