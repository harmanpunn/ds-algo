package code.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
 * Given an array, print the Next Greater Element (NGE) for every element. 
 * The Next greater Element for an element x is the first greater element on the right side of x in array. 
 * Elements for which no greater element exist, consider next greater element as -1.
 */
public class NextLargestElement {

	public static void main(String[] args) {
		int[] arr = {1,3,2,4};
		System.out.println(getNextLargestElement(arr));

	}

	private static List<Integer> getNextLargestElement(int[] arr) {
		int n = arr.length;
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=n-1; i>=0; i--) {
			if(s.isEmpty()) {
				list.add(-1);	
			} else if(!s.isEmpty() && s.peek() > arr[i]) {
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
		
		Collections.reverse(list);
		return list;
	}

}
