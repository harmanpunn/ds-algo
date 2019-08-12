package algo.quicksort;

public class App {

	public static void main(String[] args) {
		int[] inputArr = {2, 3, 4, 1, 5};
		
		QuickSort.sort(inputArr);
		
		for(int item : inputArr) {
			System.out.print(item + " -> " );
		}
	}

}
