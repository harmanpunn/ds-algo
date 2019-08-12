package code.practice;

public class MinSwap {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		System.out.println(minimumSwaps(arr));
	}
	
	
	public static int minimumSwaps(int[] arr) {
		int swap=0;
		

		
		
		
		return swap;
	}

	
	private static void swap(int[] inputArray, int j, int i) {
		int temp = inputArray[j];
		inputArray[j] = inputArray[i];
		inputArray[i] = temp;
	}	
}
