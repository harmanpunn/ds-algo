package code.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(longestSubstring("epwke"));
		System.out.println(longestSubstring_2("pwwke1"));
	}

	private static int longestSubstring(String str) {
		int i=0,j=0;
		int maxWindow = 0;
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = str.toCharArray();
		
		while(j<charArr.length) {
			char ch = charArr[j];
			int count = map.containsKey(ch) ? map.get(ch) : 0;
			map.put(charArr[j], count+1);
			
			if(map.get(charArr[j]) == 1) {
				maxWindow = Math.max(maxWindow, j-i+1);
				j++;
			} else if(map.get(charArr[j]) > 1) {
				
				while(map.get(charArr[j]) > 1) {
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
	
	private static int longestSubstring_2(String str) {
		int i=0,j=0;
		int maxWindow = 0;
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = str.toCharArray();
		
		while(j<charArr.length) {
			char ch = charArr[j];
			int count = map.containsKey(ch) ? map.get(ch) : 0;
			map.put(charArr[j], count+1);
			
			if(map.size() == j-i+1) {
				maxWindow = Math.max(maxWindow, j-i+1);
				j++;
			} else if(map.size() < j-i+1) {
				
				while(map.size() < j-i+1) {
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
