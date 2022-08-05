package code.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LC_739_Daily_Temperatures {

	public static void main(String[] args) {
		int[] temperatures = {73,74,75,71,69,72,76,73};
		
		int[] result = dailyTemperatures(temperatures);
		
		for(int i : result) {
			System.out.print(i+ ", ");
		}
	}

	private static int[] dailyTemperatures(int[] temperatures) {
	       
        List<Integer> nlrIndexList = getNLRIndex(temperatures);
         int[] arr  = new int[nlrIndexList.size()];
        for(int i=0; i<nlrIndexList.size(); i++) {
            arr[i] = Math.abs(nlrIndexList.get(i) - i);
        }
        
        return arr;
    }
    
    private static List<Integer> getNLRIndex(int[] arr) {
		int n = arr.length;
		Stack<String> s = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=n-1; i>=0; i--) {
			if(s.isEmpty()) {
				list.add(i);	
			} else if(!s.isEmpty() && Integer.parseInt(s.peek().split(":")[0]) > arr[i]) {
				list.add(Integer.parseInt(s.peek().split(":")[1]));
			} else if(!s.isEmpty() && Integer.parseInt(s.peek().split(":")[0]) <= arr[i]) {
				while(!s.isEmpty() && Integer.parseInt(s.peek().split(":")[0]) <= arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(i);
				} else {
					list.add(Integer.parseInt(s.peek().split(":")[1]));
				}
			}
			s.push(arr[i]+":"+i);
		}
		
		Collections.reverse(list);
		
		return list;
	}

}
