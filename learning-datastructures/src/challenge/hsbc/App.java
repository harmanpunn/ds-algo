package challenge.hsbc;

import java.util.Scanner;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i_arr = 0; i_arr < N; i_arr++) {
			arr[i_arr] = sc.nextInt();
		}
		solve(arr, N);
	}

	static void solve(int[] arr, int N) {
		// Please write your code here
		TreeSet<Integer> bagSet = new TreeSet<>();
		for (int num : arr) {
			bagSet.add(num);
			int lowerItem = bagSet.lower(num) == null ? -1 : bagSet.lower(num);
			int higherItem = bagSet.higher(num) == null ? -1 : bagSet.higher(num);
			System.out.println(lowerItem + " " + higherItem);

		}

	}
}
