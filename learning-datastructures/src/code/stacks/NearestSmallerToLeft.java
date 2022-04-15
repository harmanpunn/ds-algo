package code.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToLeft {

	public static void main(String[] args) {

		int[] nums = {4,5,2,10,8};
		System.out.println(getNearestSmallerToLeft(nums));
		
	}

	private static List<Integer> getNearestSmallerToLeft(int[] nums) {
		int n = nums.length;
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			if(s.isEmpty()) {
				list.add(-1);
			} else if(!s.isEmpty() && s.peek() < nums[i]) {
				list.add(s.peek());
			} else if(!s.isEmpty() && s.peek() >= nums[i]) {
				while(!s.isEmpty() && s.peek() >= nums[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(-1);
				} else {
					list.add(s.peek());
				}
			}
			
			s.push(nums[i]);
				
		}
		
		
		return list;
	}

}
