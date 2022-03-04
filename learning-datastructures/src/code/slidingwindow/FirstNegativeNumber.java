package code.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/* Given an array and a positive integer k, 
 * find the first negative integer for each and every window(contiguous subarray) of size k. */
public class FirstNegativeNumber {

	public static void main(String[] args) {

		int[] arr = {12, -1, -7, 8, -15, 13, 16, 28};
		int k = 3;
		int i=0,j=0;
		
		List<Integer> list = new ArrayList<>();
		
		while(j < arr.length) {
			if(arr[j] < 0) {
				list.add(arr[j]);
			}
			
			if(j-i+1 < k) {
				j++;
			} else if(j-i+1 == k) {
				if(list.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(list.get(0));
				}
				
				if(!list.isEmpty() && list.get(0) == arr[i]) {
					list.remove(0);
				}
				i++;
				j++;
				
			}
		}
		
	}

}
