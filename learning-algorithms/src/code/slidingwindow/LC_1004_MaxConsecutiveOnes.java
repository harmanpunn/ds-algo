package code.slidingwindow;

public class LC_1004_MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println("test: "+longestOnes(nums, 2));
	}

	
	 public static int longestOnes(int[] nums, int k) {
	        
	        int i=0,j=0;
	        int n=k;
	        int maxLength=0;
	        
	        while(j<nums.length) {
	            
	            if(nums[j] == 0) {
	                n--;
	                
	                while(n<0) {
	                    if(nums[i] == 0) {
	                        n++;
	                    }
	                    i++;
	                } 
	            }
	            
	            maxLength = Math.max(maxLength, j-i+1);
	            j++;
	        }
	        return maxLength;
	    }
}
