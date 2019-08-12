package ds.stack;

public class Stack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j) {
		if(!isFull()) {
			top++;
			stackArray[top] = j;
		} else {
			System.out.println("Stack is already full");
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		} else {
			System.out.println("The stack is already empty");
			return '0';
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
		
}
