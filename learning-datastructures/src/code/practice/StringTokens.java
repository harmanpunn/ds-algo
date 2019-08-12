package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTokens {

	public static void main(String[] args) {

		String str = "                a                    ";
		String[] strArr = str.split("[!,?._'@ ]+");
		
		List<String> list = new ArrayList<>(Arrays.asList(strArr));
		List<String> result = list.stream()                
                .filter(line -> !"".equals(line))     
                .collect(Collectors.toList());
		System.out.println(result.size());
		
		result.forEach(System.out::println);
	
		
		
	}

}
