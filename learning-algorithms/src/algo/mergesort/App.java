package algo.mergesort;

public class App {

	public static void main(String[] args) {
		int[] inputArr = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
		MergeSort sorter = new MergeSort();
		
		sorter.sort(inputArr);
		
		for(int i=0; i<inputArr.length; i++) {
			System.out.print(" -> "+inputArr[i]);
		}
	
	}

}
