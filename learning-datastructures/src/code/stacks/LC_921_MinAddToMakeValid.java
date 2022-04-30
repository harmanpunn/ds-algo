package code.stacks;

import java.util.Stack;

public class LC_921_MinAddToMakeValid {

	public static void main(String[] args) {
		System.out.println(minAddToMakeValid("(()((())"));
	}

	public static int minAddToMakeValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char i : arr ) {
            if(stack.isEmpty()) {
                stack.push(i);
            } else if(stack.peek() == '(' && i == ')') {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        return stack.size();
    }
	
}
