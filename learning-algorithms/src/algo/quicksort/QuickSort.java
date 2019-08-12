package algo.quicksort;

public class QuickSort {

	public static void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);
	}

	public static void sort(int[] inputArray, int start, int end) {
		if (start < end) {
			int q = partition(inputArray, start, end);
			sort(inputArray, start, q-1);
			sort(inputArray, q+1, end);
		}
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
