package code.leetcode.practice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strArr = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strArr));
		System.out.println(longestCommonPrefix2(strArr));
	}

	
	// Horizontal scanning - Take first element as a prefix 
	//  Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.
	private static String longestCommonPrefix(String[] strArr) {
		
		if(strArr.length == 0) return "";
		String prefix = strArr[0];
		for(int i=1; i<strArr.length; i++) {		
			while(strArr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty()) return "";
			}
		}
		
		return prefix;
		
	}
	
	//Approach 2: Vertical scanning
	//Time complexity : O(S)O(S) , where S is the sum of all characters in all strings. 
	//In the worst case there will be nn equal strings with length mm and the algorithm performs S = m \cdot nS=m⋅n character comparisons.
	private static String longestCommonPrefix2(String[] strs) {
		if(strs.length == 0) return "";
		
		for(int i=0; i<strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for(int j=1; j<strs.length; j++) {
				if(strs[j].charAt(i) != c || i == strs[j].length()) return strs[0].substring(0,i);
 			}
		}
		
		return strs[0];
	}

}
