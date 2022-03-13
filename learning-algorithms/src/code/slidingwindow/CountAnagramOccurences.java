package code.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/* Given a word pat and a text txt. 
 * Return the count of the occurences of anagrams of the word in the text. */ 
public class CountAnagramOccurences {

	public static void main(String[] args) {
		String str = "aabaabaabbaaab";
		String pattern = "aaba";
		System.out.println("Number of occurences of anagrams: "+ countOccurences(str, pattern));
		
		String str2 = "forxxorfxdofr";
		String pattern2 = "for";
		System.out.println("Number of occurences of anagrams: "+ countOccurences(str2, pattern2));
	}

	private static int countOccurences(String str, String pattern) {
		int j=0,i=0,ans=0;
		Map<Character, Integer> map = new HashMap<>();
		for(char c : pattern.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1); 
			} else {
				map.put(c, 1);
			}
		}
		int count = map.size();
		
		while(j<str.length()) {
			char charAt = str.charAt(j);
			
			if(map.containsKey(charAt)) {
				map.put(charAt, map.get(charAt) - 1 );
			} 
			if(map.containsKey(charAt) && map.get(charAt) == 0 ) {
				count--;
			}
			
			if(j-i+1 < pattern.length()) {
				j++;
			} else if(j-i+1 == pattern.length()) {
				if(count == 0) {
					ans++;
				}
				
				char charAt_I = str.charAt(i);
				if(map.containsKey(charAt_I)) {
					map.put(charAt_I, map.get(charAt_I) + 1); 
				}
				if(map.containsKey(charAt_I) && map.get(charAt_I) == 1 ) {
					count++;
				}
				
				i++;
				j++;
			}
			
		}
		
		return ans;
	}

}
