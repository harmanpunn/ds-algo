package code.practice;

import java.util.Stack;

public class SuperBalanceBrackets {

	public static void main(String[] args) {
		
		String bracket = "((((())))((())((()))))";
		char[] bracketArr = bracket.toCharArray();
		Stack<String> stack = new Stack<>();
		int leftBracket=0;
		int rightBracket=0; 
		int i=0;
		int ans = 0;
		
		for(int j=0; j<bracketArr.length; j++) {
			if(bracketArr[j]=='(') {
				stack.push("(");
			} else if (bracketArr[j]==')') {
				stack.pop();
			}
		}
		
		System.out.println(stack.isEmpty());
		
		while(i < bracketArr.length) {
			leftBracket=0;
			rightBracket=0;
			while(i < bracketArr.length && bracketArr[i] == '(') {
				leftBracket++;
				i++;
				//System.out.println("{");
			}
			
			while(i < bracketArr.length && bracketArr[i] == ')') {
				rightBracket++;
				i++;
				//System.out.println("}");
			}
			ans = Math.max(ans, 2*Math.min(leftBracket, rightBracket));
			
			
		}
		
		
		System.out.println(ans);
	}

}
