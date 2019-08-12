package code.practice;

public class NutsAndBolts {

	public static void main(String[] args) {
		
		int[] nuts = {2, 3, 4, 1, 5};
		int[] bolts = {4, 2, 5, 3, 1};
		
		matchPairs(nuts, bolts, 0, nuts.length-1);
		
		printArray(nuts);
		System.out.println("");
		printArray(bolts);
		
		
	}
	
	private static void matchPairs(int[] nuts, int[] bolts, int start, int end) {
		
		if(start < end) {
			// Choose last character of bolts array for nuts partition. 
			int pivot = partition(nuts, start, end, bolts[end]);
			
			// Now using the partition of nuts choose that for bolts 
            // partition. 
            partition(bolts, start, end, nuts[pivot]);
            
            matchPairs(nuts, bolts, start, pivot-1);
            matchPairs(nuts, bolts, pivot+1, end);
		}
	}

	private static int partition(int[] arr, int start, int end, int pivot) {
		int i = start;
		
		for (int j = start; j <= end - 1; j++) {
			if(arr[j] < pivot) {
				swap(arr, j, i);
				i++;
			} else if(arr[j] == pivot) {
				swap(arr, j, end);
				j--;
			}
		}
		swap(arr, i, end);
		return i;
	}
	
	private static void swap(int[] inputArray, int j, int i) {
		int temp = inputArray[j];
		inputArray[j] = inputArray[i];
		inputArray[i] = temp;
	}
	
	private static void printArray(int[] array) { 
		for(int val : array) {
			System.out.print(val + " ");
		}
	}
} 
