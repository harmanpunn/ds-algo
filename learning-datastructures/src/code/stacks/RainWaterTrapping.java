package code.stacks;

/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 */
public class RainWaterTrapping {

	public static void main(String[] args) {

		int[] arr1 = {3,0,0,2,0,4};
		int[] arr2 = {2,0,2};
		
		
		System.out.println(getMaxWaterTrapped(arr1));
		System.out.println(getMaxWaterTrapped(arr2));
	}

	private static int getMaxWaterTrapped(int[] arr) {
		
		int n = arr.length;
		int[] maxL = new int[n];
		int[] maxR = new int[n];
		int[] water = new int[n];
		int maxWater = 0;
		
		maxL[0] = arr[0];
		maxR[n-1] = arr[n-1];
		
		for(int i=1;i<n;i++) {
			maxL[i] = arr[i] > maxL[i-1] ? arr[i] : maxL[i-1];
		}
		
		for(int i=n-2; i>=0; i--) {
			maxR[i] = arr[i] > maxR[i+1] ? arr[i] : maxR[i+1]; 
		}
		
		for(int i=0; i<n; i++) {
			water[i] = Math.min(maxL[i], maxR[i]) - arr[i];
			maxWater +=	water[i];
		}
		
		return maxWater ;
	}

}
