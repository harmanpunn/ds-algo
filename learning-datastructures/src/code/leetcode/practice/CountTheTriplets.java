package code.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTheTriplets {

	public static void main(String[] args) {
		
		int[] arr = {12,8,2,11,5,14,10};
		
		System.out.println(countTriplets(arr));

	}

	
	//Time Complexity: O(n^2)
	// Auxiliary Space: O(1)
	private static int countTriplets(int[] arr) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int m=0;m<arr.length;m++) {
			list.add(arr[m]);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(list.contains(arr[i] + arr[j]))
				count++;
			}
		}
		
		return count;
	}

}
