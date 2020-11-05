package code.leetcode.practice;

public class SubarrayWithSum {

	public static void main(String[] args) {
		
		int arr[] = {10, 2, -2, -20, 10};
		int sum = -10;
		System.out.println(subArraySum(arr, sum));
		System.out.println(subArraySum2(arr, arr.length, sum));
	}

	//Time Complexity : O(n)
	//Space Complexity: O(1)
	private static String subArraySum2(int[] arr, int length, int sum) {
		
		int currSum = arr[0];
		int start = 0;
		
		
		for(int i=1; i<=length; i++) {
			
			while(currSum > sum && start < i-1) {
				currSum = currSum - arr[start];
				start++;
			}
			if(currSum == sum) {
				int p = i-1;
				return Integer.toString(start) + " " + Integer.toString(p);
			}
			
			if(i < length) {
				currSum+=arr[i];
			}
		}
		return "Sum doesn't exist";
	}


	// Time Complexity O(n^2)
	// Space Complexity O(1)
	private static String subArraySum(int[] arr, int sum) {
		
		int currSum;
		for(int i=0; i<arr.length; i++) {
			currSum = arr[i];
			
			for(int j=i+1; j<arr.length; j++) {
				if(currSum == sum) {
					int p = j-1;
					return Integer.toString(i) + " " + Integer.toString(p);
				}
				
				if(currSum > sum || j == arr.length) break;
				
				currSum += arr[j];
			}
		}
		
		
		return "Sum doesn't exist";
	}

}
