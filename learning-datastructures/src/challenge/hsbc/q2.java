package challenge.hsbc;

import java.util.ArrayList;
import java.util.List;

public class q2 {

	 public static void main(String args[]) {
		 
	        List<String> output = q2.genPerm("AB");
	        output.stream().forEach(System.out::println); 
	    }
	 
	    public static List<String> genPerm(String input) 
	    {
	         List<String> strList = new ArrayList<String>();
	         q2.permutations("", input, strList);
	         return strList;
	    }
	 
	    private static void permutations(String consChars, String str, List<String> opContainer){
	 
	            for(int i=0; i<str.length(); i++) {
	            //	permutations(consChars+str.charAt(i), str.substring(0,+str.substring(i+1),opContainer);	        
	            	}
	    }
}
