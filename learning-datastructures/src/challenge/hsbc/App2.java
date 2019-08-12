package challenge.hsbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			List<Integer> list = new ArrayList<>();
			int N = sc.nextInt();
			int S = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}
			int out = solve(list, N, S);
			System.out.println(out);
		}
	}

	static int solve(List list, int N, int S) {

		/*
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * for(int item : arr) { list.add(item); }
		 */

		// List<Integer> list =
		// Arrays.stream(arr).boxed().collect(Collectors.toList());
		//list.add(S);
		int left = 0;
		int right = 0;
		for (int i = 0; i < list.size(); i++) {
			if (S > (int) list.get(i)) {
				left++;
			} else {
				right++;
			}

		}
		/*
		 * int listSize = list.size(); int samIndex = list.indexOf(S); int
		 * rightElements = (listSize - 1) - samIndex; int leftElements =
		 * samIndex;
		 */

		return Math.abs(right - left);
	}
}
