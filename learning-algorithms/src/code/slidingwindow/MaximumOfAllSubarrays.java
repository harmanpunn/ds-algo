package code.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array arr[] of size N and an integer K. 
 * Find the maximum for each and every contiguous subarray of size K.
 */
public class MaximumOfAllSubarrays {

	public static void main(String[] args) {

		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};   // O/P 3 3 5 5 6 7
		int i=0,j=0;
		int k=3; //window size
		List<Integer> list = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		
		
		while(j< arr.length) {
			//Calculation
			while(!list.isEmpty() && list.get(list.size()-1) < arr[j]) {
				list.remove(list.size()-1);
			}
			list.add(arr[j]);
			
			if(j-i+1 < k) j++;
			
			if(j-i+1 == k) {
				// answer calculation
				ans.add(list.get(0));
				
				if(list.get(0) == arr[i]) {
					list.remove(0);
				}
				
				i++;
				j++;
			}
		}
		
		for(int item : ans) {
			System.out.print(item + ", ");
		}
		
	}

}
