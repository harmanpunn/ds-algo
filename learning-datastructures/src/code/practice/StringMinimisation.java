package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
	
import org.apache.commons.lang3.StringUtils;

public class StringMinimisation {

	public static void main(String[] args) {
		
		String str = "aaaaacbcbca";
		char[] strArr = str.toCharArray();
		int strLength = str.length();
		System.out.println(strLength);
		int i=0, j=strLength-1;
		int flag=0;
		for(i=0;i<=j;i++)
		{
			if(strArr[i]==strArr[j] ){
			while( i<j && strArr[i]==strArr[i+1] )
				i++;
			i++;
			while(j>0 && strArr[j]==strArr[j-1])
				j--;
			
		     j--;
			      if(i==j) {
				      flag=1;
			       }
			}
			else
			{
				
				flag=j-i+1;
				break;
			}
			i--;
			
		}
		
			System.out.println(flag);
	}


}
