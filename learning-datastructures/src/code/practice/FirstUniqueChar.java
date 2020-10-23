package code.practice;

import java.util.HashMap;

public class FirstUniqueChar {

	public static void main(String[] args) {

		
		System.out.println(firstUniqueChar("loveleetcode"));
	}
	
	public static int firstUniqueChar(String s) {
       HashMap<Character, Integer> count = new HashMap<>();
       
       for(int i=0; i<s.length(); i++) {
    	   char c = s.charAt(i);
    	   count.put(c, count.getOrDefault(c, 0) + 1);
       }
       
       for (int i = 0; i < s.length(); i++) {
           if (count.get(s.charAt(i)) == 1) 
               return i;
       }
		
		return -1;
    }

}
