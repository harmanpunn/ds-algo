package code.slidingwindow;

public class LC_1493_LongestSubarray_DeletingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,0,1,0,1,1,0,1,1};
		System.out.println(longestSubarray(nums));
	}

	public static int longestSubarray(int[] nums) {
        
        int i=0,j=0;
        int len=0;
        int count=0;
        
        while(j<nums.length) {
        	if(nums[j] == 0) {
        		count++;
        	}
        	while(count>1) {
        		if(nums[i] == 0) 
        			count--;
        		i++;
        	}
            
        	
        	len = Math.max(j-i, len);
        	j++;			
        }
        
        return len;
    }
}
