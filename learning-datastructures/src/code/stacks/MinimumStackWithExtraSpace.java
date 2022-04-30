package code.stacks;

import java.util.Stack;


/*
 * Return minimum element from the SpecialStack.
 */
public class MinimumStackWithExtraSpace {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		Stack<Integer> ss = new Stack<>();
		
		pushEl(s, ss, 18);
		pushEl(s, ss, 19);
		pushEl(s, ss, 29);
		pushEl(s, ss, 15);
		pushEl(s, ss, 16);
		
		System.out.println(getMinimumEl(ss));
		
		popEl(s, ss);
		popEl(s, ss);
		
		System.out.println(getMinimumEl(ss));
	}
	
	public static void pushEl(Stack<Integer> s, Stack<Integer> ss, int num) {
		s.push(num);
		if(ss.isEmpty() || num <= ss.peek()) {
			ss.push(num);
		}
	}
	
	public static int popEl(Stack<Integer> s, Stack<Integer> ss) {
		if(s.isEmpty()) return -1;
		
		int ans = s.pop();
		if(ss.peek() == ans) {
			ss.pop();
		}
		return ans;
	}
	
	public static int getMinimumEl(Stack<Integer> ss) {
		if(ss.isEmpty()) return -1;
		
		return ss.peek();
	}

}
