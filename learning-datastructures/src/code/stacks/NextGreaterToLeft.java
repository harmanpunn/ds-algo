package code.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Given an array of integers, find the closest (not considering distance, but value) 
 * greater on left of every element. If an element has no greater on the left side, print -1.
 * 
 */
public class NextGreaterToLeft {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4};
		System.out.println(getNextGreaterToLeft(arr));

	}

	private static List<Integer> getNextGreaterToLeft(int[] arr) {
		int n = arr.length;
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			
			if(s.isEmpty()) {
				list.add(-1);
			} else if(!s.isEmpty() &&  s.peek() > arr[i]) {
				list.add(s.peek());
			} else if(!s.isEmpty() && s.peek() <= arr[i]) {
				while(!s.isEmpty() && s.peek() <= arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(-1);
				} else {
					list.add(s.peek());
				}
			}
			s.push(arr[i]);
		}
		
		
		return list;
	}

}
