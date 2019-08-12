package code.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		//set.add(new String("c"));
		
		String str1 = "Samsung";
		String str2 = "Samsung";
		
		String str3 = new String("Lenovo");
		String str4 = new String("Lenovo");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(set);
		
		for(String item : set) {
			item = "a";
		}
		
		try {
			String pageUrl =new URL("https://www.roche.com/test.html").getPath();
			System.out.println(pageUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	

}
