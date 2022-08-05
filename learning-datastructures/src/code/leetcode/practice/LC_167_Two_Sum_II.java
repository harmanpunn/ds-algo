package code.leetcode.practice;

public class LC_167_Two_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,7,11,15};
		int t = 9;
		
		 int[] arr = twoSum(nums, t);
		 
		 for(int c: arr) {
			 System.out.println(c);
		 }

	}
	
	   public static int[] twoSum(int[] numbers, int target) {
	        
	        int n = numbers.length;
	        int[] arr = new int[2];
	        
	        for(int i=0; i<n; i++) {
	            int el = numbers[i];
	            int d = target - el;
	            
	            int num = recursiveBinarySearch(numbers, i+1, n-1, d);
	            
	            if(num != -1) {
	                 arr[0] = i+1;
	                arr[1] = num+1;
	            }
	        }
	        return arr;
	    }
	    
	   private static int recursiveBinarySearch(int[] arr, int p, int r, int x) {
			if (p > r) {
				return -1;
			} else {
				int q = (p + r) / 2;
				if (arr[q] == x) {
					return q;
				} else if (arr[q] > x) {
					return recursiveBinarySearch(arr, p, q - 1, x);
				} else {
					return recursiveBinarySearch(arr, q + 1, r, x);
				}
			}
		}

}
