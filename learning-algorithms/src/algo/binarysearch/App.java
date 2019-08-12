package algo.binarysearch;

public class App {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("Binary Search: " + binarySearch(array1, 7));
		System.out.println("Recursive Binary Search: " + recursiveBinarySearch(array1, 0, array1.length-1, 12));
	}

	private static int binarySearch(int[] arr, int x) {
		int p = 0;
		int r = arr.length - 1;

		while (p <= r) {
			int q = (p + r) / 2;
			if (arr[q] == x) {
				return q;
			} else if (arr[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}

	private static int recursiveBinarySearch(int[] arr, int p, int r, int x) {
		System.out.println("[ " + p + "..." + r + " ]");
		if (p > r) {
			return -1;
		} else {
			int q = (p + r) / 2;
			if (arr[q] == x) {
				return q;
			} else if (arr[q] > x) {
				return recursiveBinarySearch(arr, p, q - 1, x);
			} else {
				return recursiveBinarySearch(arr, q + 1, r, x);
			}
		}
	}
}
