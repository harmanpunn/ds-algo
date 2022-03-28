package code.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int diff=0;
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<nums.length; i++) {
	    	if(map.containsKey(nums[i])) {
	    		diff = Math.abs(map.get(nums[i]) - i);
	        	if(diff <= k) { 
	        		return true;
	        	} else {
	        		map.put(nums[i], i);
	        	}
	        } else {
	        	map.put(nums[i], i);
	        }
	    }
	    return false;
	}
}
