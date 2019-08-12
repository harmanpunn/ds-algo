package challenge.hsbc;

import java.util.Collections;
import java.util.*;

public class q3 
{
	public q3(String val) 
	{
	this.val = val;
	}
private String val;

public static void main(String args[]) 
{
	Map<String, Integer> map1 = new HashMap<String, Integer>();
	String str1 = new String("Java OOPs!");
	String str2 = new String("Java OOPs");
	map1.put(str1, new Integer(10));
	map1.put(str2, new Integer(20));
	Map<q3, Integer> map2 = new HashMap<q3, Integer>();
	q3 str3 = new q3(str1);
	q3 str4 = new q3(str2);
	map2.put(str3, new Integer(10));
	map2.put(str4, new Integer(20));
	System.out.println(map1.get(str1));
	System.out.println(map2.get(str3));
}
}