package code.practice;

import java.util.Scanner;

public class RotateArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * String[] nd = scanner.nextLine().split(" ");
		 * 
		 * int n = Integer.parseInt(nd[0]);
		 * 
		 * int d = Integer.parseInt(nd[1]);
		 * 
		 * int[] a = new int[n];
		 * 
		 * String[] aItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < n; i++) { int aItem =
		 * Integer.parseInt(aItems[i]); a[i] = aItem; }
		 */

		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		} catch(Exception e) {
			System.out.println(e);
		}
		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 4;
		int[] rotatedArray = rotateArray(arr, d);

		for (int item : rotatedArray) {
			System.out.print(item + " ");
		}

		scanner.close();
	}

	public static int[] rotateArray(int[] a, int d) {
		for (int i = 0; i < d; i++) {
			rotate(a);
		}
		return a;
	}

	private static void rotate(int[] a) {
		int first = a[0];
		for(int i=0; i<	a.length-1; i++){
			a[i] = a[i+1];
		}
		a[a.length-1] = first;
	} 

}
