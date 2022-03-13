package code.slidingwindow;

/* Maximum Sum Subarray of size K | Sliding Window 
 * Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K. */
public class MaxSumSubarray {

	public static void main(String[] args) {
		
		int[] arr= {2,5,1,8,2,9,1};
		int i=0,j=0,sum=0,max=0;
		int k = 3;
		
		while(j < arr.length) {
			sum = sum + arr[j];
			if(j-i+1 < k) {
				j++;
			} else if(j-i+1 == k) {
				max = Math.max(max, sum);
				sum = sum - arr[i];
				i++;
				j++;
			}
		}
		System.out.println("Max, "+ max);
	}
}
