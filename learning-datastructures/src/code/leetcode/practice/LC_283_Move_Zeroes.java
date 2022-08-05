package code.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class LC_283_Move_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {1,0,1};
			
			List<Integer> list = new ArrayList<>();
			
			System.out.println(Math.abs(0));
 			
			moveZeroes(arr);
			
			for(int c : arr ) {
				 System.out.print(c + ",");
			}
	}
	
	 public static void moveZeroes(int[] nums) {
	        
	        int n = nums.length;
	        
	        int i=0,j=1;
	        
	        while(i<n && j<n) {
	        	 if(nums[i] != 0) i++;
	        	if(nums[i] == 0 && nums[j] != 0) {
	        		swap(nums, i, j);
	        		i++;
	        	}
	        	j++;
	        	
	        }
 	        
//	        for(int i=0; i<n; i++) {
//	            for(int j=i+1; j<n; j++) {
//	                if(nums[i] == 0 && nums[j] != 0) {
//	                    swap(nums, i, j);
//	                    break;
//	                }
//	            }
//	        }
	        
	    }
	    
	    private static void swap(int[] inputArray, int j, int i) {
			int temp = inputArray[j];
			inputArray[j] = inputArray[i];
			inputArray[i] = temp;
		}

}
