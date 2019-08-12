package algo.mergesort;

public class MergeSort {

	public static void sort(int[] inputArr) {
		sort(inputArr, 0, inputArr.length - 1);
	}

	private static void sort(int[] inputArr, int start, int end) {
		if (end <= start) {
			return;
		}

		int mid = (start + end) / 2;
		sort(inputArr, start, mid); // sorts left half
		sort(inputArr, mid + 1, end); // sorts right half
		merge(inputArr, start, mid, end); // merge sorted results into inputarray

	}

	private static void merge(int[] inputArr, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];

		// index counter for the left and right side of the array
		int leftSlot = start;
		int rightSlot = mid + 1;
		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArr[leftSlot] < inputArr[rightSlot]) {
				tempArray[k] = inputArr[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArr[rightSlot];
				rightSlot++;
			}
			k++;
		}

		/*
		 * When its here means above loop is completed. So both the left and
		 * right side of the sub array can be considered sorted.
		 */

		if (leftSlot <= mid) {
			// consider the right side done being sorted. Left must be sorted
			// already
			while (leftSlot <= mid) {
				tempArray[k] = inputArr[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = inputArr[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		for(int i=0; i<tempArray.length; i++) {
			inputArr[start+i] = tempArray[i];
		}
	}

}
