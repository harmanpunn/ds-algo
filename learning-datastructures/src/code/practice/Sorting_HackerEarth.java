package code.practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Sorting_HackerEarth extends Thread {

	public static void main(String[] args) {
		
		Sorting_HackerEarth thread = new Sorting_HackerEarth();
         thread.start();
	
         System.out.println("Name :"+thread.getName());
         System.out.println("Priority: " +thread.getPriority());
	/*	
		Map<Integer, Integer> count = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			
			if(count.containsKey(key)) {
				int freq = count.get(key);
				freq++;
				count.put(key, freq);
			} else {
				count.put(key, 1);
			}
		}
		
		int leastOccured = leastOccured(n, count);
		int mostOccured = mostOccured(n, count);
		System.out.println(count.get(mostOccured) - count.get(leastOccured));*/
		
		
		
		
 	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[1000001];
		for(int i=0; i<n; i++) {
			int index=sc.nextInt();
			arr[index]++; 
		}

		int maxVal = getMax(arr);
		int minVal = getMin(arr);
		
		System.out.println(maxVal - minVal);
		sc.close();
	}
	
	
	// Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = 1000001; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue&&inputArray[i]!=0){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	
	// Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }

	//Find most frequency
	private static int mostOccured(int n, Map<Integer, Integer> count) {
		int max_count = 0, res = -1;		
		for(Entry<Integer, Integer> entry : count.entrySet()) {
			if(max_count <  entry.getValue()) {
				res = entry.getKey();
				max_count = entry.getValue();
			}
		}
		return res;
	}

	//Find min frequency
	private static int leastOccured(int n, Map<Integer, Integer> count) {
		
		int min_count = n+1, res = -1;	
		for(Entry<Integer, Integer> entry : count.entrySet()) {
			if(min_count >=  entry.getValue()) {
				res = entry.getKey();
				min_count = entry.getValue();
			}
		}
		return res;
	}

}
