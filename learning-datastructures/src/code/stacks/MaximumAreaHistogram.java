package code.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.sun.tools.javac.util.Pair;

/*
 * Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. 
 * For simplicity, assume that all bars have same width and the width is 1 unit.
 */
public class MaximumAreaHistogram {

	public static void main(String[] args) {
		
		int[] arr = {6, 2, 5, 4, 5, 1, 6};
		System.out.println(getMaximumAreaHistogram(arr));
	}

	private static int getMaximumAreaHistogram(int[] arr) {
		List<Integer> nsrIndexList = getNSRIndex(arr);
		List<Integer> nslIndexList = getNSLIndex(arr);
		int maxArea = 0;
		
		for(int i=0; i<arr.length; i++) {
			int width = nsrIndexList.get(i) - nslIndexList.get(i) - 1;
			maxArea = Math.max(maxArea, width*arr[i]);
		}
		return maxArea;
	}

	private static List<Integer> getNSLIndex(int[] nums) {

		int n = nums.length;
		Stack<Pair<Integer, Integer>> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			if(s.isEmpty()) {
				list.add(-1);
			} else if(!s.isEmpty() && s.peek().fst < nums[i]) {
				list.add(s.peek().snd);
			} else if(!s.isEmpty() && s.peek().fst >= nums[i]) {
				while(!s.isEmpty() && s.peek().fst >= nums[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(-1);
				} else {
					list.add(s.peek().snd);
				}
			}
			s.push(new Pair<Integer, Integer> (nums[i],i));
		}
		return list;
	}

	private static List<Integer> getNSRIndex(int[] arr) {
		int n = arr.length;
		Stack<Pair<Integer, Integer>> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=n-1; i>=0; i--) {
			if(s.isEmpty()) {
				list.add(n);	
			} else if(!s.isEmpty() && s.peek().fst < arr[i]) {
				list.add(s.peek().snd);
			} else if(!s.isEmpty() && s.peek().fst >= arr[i]) {
				while(!s.isEmpty() && s.peek().fst >= arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(n);
				} else {
					list.add(s.peek().snd);
				}
			}
			s.push(new Pair<Integer, Integer> (arr[i],i));
		}
		
		Collections.reverse(list);
		
		return list;
	}

}
