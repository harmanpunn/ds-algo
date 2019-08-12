package challenge.hsbc;

import java.io.IOException;
import java.util.ArrayList;

public class q11 {

	public static void main(String[] args) {
		
		int hck;
		try {
			hck = System.in.read();
			System.out.println(hck);
		} catch (IOException hack) {
			System.out.println("Input not read");
		}
		
		 ArrayList<Integer> hack = new ArrayList<Integer>(); 
	        hack.add(7); 
	        hack.add(8); 
	        hack.add(9); 
	        hack.add(11); 
	        hack.forEach(a -> System.out.println(a)); 
	        hack.forEach(a -> { if (a%2 == 0) System.out.println(a); }); 

	}

}
