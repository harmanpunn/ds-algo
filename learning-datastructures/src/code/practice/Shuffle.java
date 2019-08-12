package code.practice;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int arrLength = arr.length;
		
		Random r = new Random();
		
		for(int i=arrLength-1; i>0; i--) {
			int j = r.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
