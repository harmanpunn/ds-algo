package code.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinSumFormedByDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			StringBuilder sb = new StringBuilder();
			int even = 0;
			int odd = 0;
			for(int e=0; e<n; e=e+2) {
				sb.append(arr[e]);
				even = Integer.parseInt(sb.toString());
			}
			sb.delete(0, sb.length());
			for(int o=1; o<n; o=o+2) {
				sb.append(arr[o]);
				odd = Integer.parseInt(sb.toString());
			}
			System.out.println(even + odd);
		}
	}

}
