package code.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToRight {

	public static void main(String[] args) {
		

		int[] nums = {4,5,2,10,8};
		System.out.println(getNearestSmallerToRight(nums));
		
	}

	private static List<Integer> getNearestSmallerToRight(int[] arr) {

		int n = arr.length;
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=n-1; i>=0; i--) {
			if(s.isEmpty()) {
				list.add(-1);	
			} else if(!s.isEmpty() && s.peek() < arr[i]) {
				list.add(s.peek());
			} else if(!s.isEmpty() && s.peek() >= arr[i]) {
				while(!s.isEmpty() && s.peek() >= arr[i]) {
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
