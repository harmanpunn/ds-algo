package code.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
 * Substrings of Size Three with Distinct Characters
 * Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
 */
public class LC_1876_GoodSubstrings {

	public static void main(String[] args) {
		System.out.println(countGoodSubstrings("aababcabc"));
		System.out.println(countGoodSubstrings("xyzzaz"));
	}
	
	public static int countGoodSubstrings(String s) {
        int i=0,j=0,k=3;
        int ans=0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        while(j<s.length()) {
            char ch = s.charAt(j);
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count+1);
            
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                if(map.size() == 3) {
                    ans++;
                } 
                char rm = s.charAt(i);
                map.put(rm, map.get(rm)-1);
                if(map.get(rm) == 0) {
                    map.remove(rm);
                }
                i++;
                j++;
            }
        }
       return ans; 
    }

}
