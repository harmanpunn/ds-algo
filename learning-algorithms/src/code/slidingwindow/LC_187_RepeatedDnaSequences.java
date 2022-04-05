package code.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_187_RepeatedDnaSequences {

	public static void main(String[] args) {
		List<String> repeatedSubSequenceList = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		
		for(String s: repeatedSubSequenceList) {
			System.out.println(s);
		}
	}
	
	
	public static List<String> findRepeatedDnaSequences(String s) {
        int i=0,j=0;
        int k=10;
        List<String> repeatedSubSequenceList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        while(j<s.length()) {
            
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                String subSequence = s.substring(i, i+10);
                map.put(subSequence, map.getOrDefault(subSequence, 0)+1);
                
                if(map.get(subSequence) == 2) {
                    repeatedSubSequenceList.add(subSequence);
                }
                
                i++;
                j++;
            }
            
        }
        return repeatedSubSequenceList;
    }

}
