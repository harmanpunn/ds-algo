package code.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string you need to print the size of the longest possible substring that has exactly k unique characters.
 * 
 */
public class LongestSubstring {

	public static void main(String[] args) {

		System.out.println(longestSubstring("aabacbebebe", 3));
		System.out.println(longestSubstring("aaaa", 1));
	
	}

	private static int longestSubstring(String str, int k) {
		int i=0,j=0;
		int maxWindow=0;
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = str.toCharArray();
		
		while(j<charArr.length) {
			char ch = charArr[j];
			int count = map.containsKey(ch) ? map.get(ch) : 0;
			map.put(ch, count + 1 );
			if(map.size() < k) {
				j++;
			} else if(map.size() == k) {
				maxWindow = Math.max(j-i+1, maxWindow);
				j++;
			} else if(map.size() > k) {
				
				while(map.size() > k) {
					char rm = charArr[i];
					map.put(rm, map.get(rm)-1);
					if(map.get(rm) == 0) {
						map.remove(rm);
					}
					i++;
				}
				j++;
			}
			
		}
		
		return maxWindow;
	}

}
