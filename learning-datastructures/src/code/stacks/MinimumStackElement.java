package code.stacks;

import java.util.Stack;


public class MinimumStackElement {
	
	private static int minEl = 0;

	private static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		pushEl(18);
		pushEl(19);
		pushEl(29);
		pushEl(15);
		pushEl(16);
		
		System.out.println(getMinimum());
		
		popEl();
		popEl();
		popEl();
		System.out.println(getMinimum());
		System.out.println(top());
		pushEl(1);
		pushEl(2);
		pushEl(3);
		System.out.println(getMinimum());
		System.out.println(top());
	}
	
	public static int getMinimum() {
		if(stack.isEmpty()) return -1;
		
		return minEl;
	}
	
	public static void pushEl(int num) {
		if(stack.isEmpty()) {
			stack.push(num);
			minEl = num;
		} else if(num >= minEl) {
			stack.push(num);
		} else if(num < minEl) {
			stack.push(2*num - minEl);
			minEl = num;
		}
	}
	
	public static int popEl() {
		if(stack.isEmpty()) {
			return -1;
		} else {
			if(stack.peek() >= minEl) {
				return stack.pop();
			} else if(stack.peek() < minEl) {
				minEl = 2*minEl - stack.peek();
				return stack.pop();
			}
		}
		return -1;
	}
	
	public static int top() {
		if(stack.isEmpty()) {
			return -1;
			
		} else {
			if(stack.peek() >= minEl) {
				return stack.peek();
			} else if(stack.peek() < minEl) {
				return minEl;
			}
		}
		return -1;
	}

}
