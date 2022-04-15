package code.stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * The stock span problem is a financial problem where we have a series of n daily price quotes for a stock 
 * and we need to calculate span of stock’s price for all n days.
 * 
 * The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days 
 * just before the given day, for which the price of the stock on the current day is less than or equal 
 * to its price on the given day.
 * 
 * For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, 
 * then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
 * 
 * Concept: NGL
 */
public class StockSpanProblem {

	public static void main(String[] args) {
		int[] arr = {100, 80, 60, 70, 60, 75, 85};
		System.out.println(getSpanValues(arr));
	}

	private static List<Integer> getSpanValues(int[] arr) {

		int n = arr.length;
		Stack<String> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			if(s.isEmpty()) {
				list.add(-1);
			} else if(!s.isEmpty() &&  Integer.parseInt(s.peek().split(":")[0]) > arr[i]) {
				list.add(Integer.parseInt(s.peek().split(":")[1]));
			} else if(!s.isEmpty() && Integer.parseInt(s.peek().split(":")[0]) <= arr[i]) {
				while(!s.isEmpty() && Integer.parseInt(s.peek().split(":")[0]) <= arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(-1);
				} else {
					list.add(Integer.parseInt(s.peek().split(":")[1]));
				}
			}
			s.push(arr[i]+":"+i);
		}
		
		for(int i=0;i<n;i++) {
			list.set(i, i - list.get(i));
		}
		
		return list;
	}

}
