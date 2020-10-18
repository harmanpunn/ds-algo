package code.practice;

import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
	
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		System.out.println(Arrays.toString(shuffle(nums, n)));

	}
	
	public static int[] shuffle(int[] nums, int n) {
		int[] shuffledArr = new int[2*n];
		int e = 0;
		for(int i=0; i<n; i++) {
			shuffledArr[e] = nums[i];
			e+=2;
		}
		
		int o = 1;
		for(int i=n; i<2*n; i++) {
			shuffledArr[o] = nums[i];
			o+=2;
		}
		
		return shuffledArr;
	}

}
