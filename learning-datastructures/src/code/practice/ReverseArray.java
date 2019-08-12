package code.practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		reverse(arr);
		
		System.out.print(Arrays.toString(arr));
		
	}
	
	private static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int other = arr.length - i - 1;
			int temp = arr[i];
			arr[i] = arr[other];
			arr[other] = temp;
		}
	}

}
