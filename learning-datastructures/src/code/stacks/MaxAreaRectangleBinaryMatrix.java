package code.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.sun.tools.javac.util.Pair;


/*
 * Given a binary matrix, find the maximum size rectangle binary-sub-matrix with all 1’s.
 */
public class MaxAreaRectangleBinaryMatrix {

	public static void main(String[] args) {

		int n=4,m=4;
		int[][] arr = {
				{0,1,1,0},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,0,0}
				};
		
		System.out.println(getMaxArea(arr,n,m));
	}

	private static int getMaxArea(int[][] arr, int row, int col) {
		
		int[] vector = new int[col];
		
		for(int j=0; j<col; j++) {
			vector[j] = arr[0][j];
		}
		
		int maxArea = getMaximumAreaHistogram(vector);
		
		for(int i=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j] == 0) {
					vector[j] = 0;
				} else {
					vector[j]+= arr[i][j];
				}
			}
			maxArea = Math.max(maxArea, getMaximumAreaHistogram(vector));
		}
		return maxArea;
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
