package algo.linearsearch;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("Linear Search: " + linearSearch(array1, 7));
		System.out.println("Recursive Linear Search: " + recursiveLinearSearch(array1, 0, 11));
	}

	
	/**
	 * Linear search.
	 *
	 * @param arr the arr
	 * @param x the x
	 * @return the int
	 */
	private static int linearSearch(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Recursive linear search.
	 *
	 * @param arr the arr
	 * @param i the i
	 * @param x the x
	 * @return the int
	 */
	private static int recursiveLinearSearch(int[] arr, int i, int x) {
		if(i > arr.length - 1) {
			return -1;
		} else if (arr[i] == x) {
			return i;
		} else {
			return recursiveLinearSearch(arr, i+1, x);
		}
	}
}
