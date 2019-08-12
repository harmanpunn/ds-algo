package code.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); 
		
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    int[] c = new int[n];
		    
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
		    
		    for(int i=0; i<n-1; i++) {
		        c[i] = Integer.parseInt(strs[i]);
		    }
		    int sumO = n*(n+1)/2;
		    
		    for(int i=0; i<c.length; i++) {
		        sumO -= c[i];
		    }
		    System.out.println(sumO);

		}
	}

}
