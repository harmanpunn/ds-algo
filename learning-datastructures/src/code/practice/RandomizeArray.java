package code.practice;

import java.util.Random;

public class RandomizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7 ,8, 9};
		Random r = new Random();
		
		int[] randomizedArray = randomize(arr, r);

		for(int a : randomizedArray) {
			System.out.print(" -> "+a);
		}
	}

	private static int[] randomize(int[] arr, Random r) {
		
		for(int i=0; i<arr.length; i++) {
			int j = r.nextInt(i+1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}

}
