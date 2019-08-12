package code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		

		for (int j = 0; j < q; j++) {
			String query = sc.next();
			switch (query) {
			case "Insert":
				int index = sc.nextInt();
				int value = sc.nextInt();
				list.add(index, value);
				break;
			case "Delete":
				int i = sc.nextInt();
				list.remove(i);
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}

		}

		for (int val : list) {
			System.out.print(val + " ");
		}

	}

}
