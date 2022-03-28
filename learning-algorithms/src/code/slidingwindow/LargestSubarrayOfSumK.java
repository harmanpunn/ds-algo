package code.slidingwindow;

/*
 * Given an array containing N positive integers and an integer K. 
 * Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
 */
public class LargestSubarrayOfSumK {

	public static void main(String[] args) {
		int[] arr = {4,1,1,1,2,3,5};
		int k = 5;
		System.out.println(getLargestSubarray(arr, k));
	}

	private static int getLargestSubarray(int[] arr, int k) {

		int i=0,j=0;
		int sum=0;
		int maxWindow=0;
		
		while(j<arr.length) {
			sum += arr[j];
			if(sum < k) {
				j++;
			} else if(sum == k) {
				maxWindow = Math.max(maxWindow, j-i+1);
				j++;
			} else if(sum > k) {
				while(sum > k)  {
					sum -= arr[i];
					i++;
				}
				j++;
			}
		}
		return maxWindow;
	}

}
