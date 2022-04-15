package code.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC_496_Next_Greater_Element_I {

	public static void main(String[] args) {

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		
		int[] result = nextGreaterElement(nums1, nums2);
		
		for(int c : result) 
			System.out.print(c+ ", ");
	}
	
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
		int n2 = nums2.length;
        int[] result = new int[n1];
		Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=n2-1; i>=0; i--) {
			if(s.isEmpty()) {
                map.put(nums2[i], -1);
			} else if(!s.isEmpty() && s.peek() > nums2[i]) {
                map.put(nums2[i], s.peek());
			} else if(!s.isEmpty() && s.peek() <= nums2[i]) {
				while(!s.isEmpty() && s.peek() <= nums2[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
                    map.put(nums2[i], -1);
				} else {
                    map.put(nums2[i], s.peek());
				}
			}
			s.push(nums2[i]);
		}
        
        for(int j=0; j<n1; j++) {
            result[j] = map.containsKey(nums1[j]) ? map.get(nums1[j]) : -1;
        }
        return result;
    }

}
