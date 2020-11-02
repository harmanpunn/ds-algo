package code.leetcode.practice;

public class BuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
		
		
	}
	
	
	 public static int maxProfit(int[] prices) {
	        
		 int i=0;
		 int peak = prices[0];
		 int valley = prices[0];
		 int maxProfit = 0;
		 
		 while(i < prices.length - 1) {
			 while(i < prices.length - 1 && prices[i] >= prices[i+1]) {
				 i++;
			 }
			 valley = prices[i];
			 
			 while(i < prices.length - 1 && prices[i] <= prices[i+1]) {
				 i++;
			 }
			 peak = prices[i];
			 maxProfit += peak - valley;
		 }
		 return maxProfit;
	        
	 }

}
