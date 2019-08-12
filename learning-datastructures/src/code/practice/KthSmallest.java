package code.practice;

public class KthSmallest {

	public static void main(String[] args) {

		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		int val = kthSmallest(arr, 0, arr.length-1, k);
		
		
		System.out.println(val);
		
	}

	
	public static int kthSmallest(int[] inputArray, int start, int end, int k) {
		
		if(k > 0 && k <= end - start + 1 ) {
			int q = partition(inputArray, start, end);
			
			if(q - start == k - 1) {
				return inputArray[q];
			}
			
			if(q-start > k-1) {
				return kthSmallest(inputArray, start, q-1, k);
			}
			
			return kthSmallest(inputArray, q+1, end, k-q+start-1);
		}
		return Integer.MAX_VALUE;
	}


	private static int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		int i = start - 1;
		
		for (int j = start; j <= end - 1; j++) {
			if(inputArray[j] <= pivot) {
				i=i+1;
				swap(inputArray, j, i);
			}
		}
		swap(inputArray, i+1, end);
		return i+1;
	}
	
	private static void swap(int[] inputArray, int j, int i) {
		int temp = inputArray[j];
		inputArray[j] = inputArray[i];
		inputArray[i] = temp;
	}
	
}
