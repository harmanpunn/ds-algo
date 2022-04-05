package code.slidingwindow;

/*
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 */
public class LC_209_MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, nums));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        while(j<nums.length) {
        	sum = sum+nums[j];
            while(sum >= target) {
            	minLength = Math.min(j-i+1, minLength);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;   
    }

}
