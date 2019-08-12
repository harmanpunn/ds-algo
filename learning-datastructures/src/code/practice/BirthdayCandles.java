package code.practice;

import java.util.Arrays;
import java.util.Collections;

public class BirthdayCandles {

	public static void main(String[] args) {
		
		Integer[] arr = {3, 2, 1, 3, 3, 3, 4,4 ,4, 5};
		int largest = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= largest) {
				if(arr[i] == largest) {
					count++;
				} else {
					count = 1;
				}
				largest = arr[i];
			}
		}
		System.out.println(count);
	}

}
