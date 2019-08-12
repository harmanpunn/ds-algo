package code.practice;


public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "hello";
		System.out.println(sortString(str1).equals(sortString(str2)));

	}
	
	public static String sortString(String str) {
		int[] hashArray = new int[26];
		for(int i=0; i<str.length(); i++) {
			hashArray[str.toLowerCase().charAt(i)-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<hashArray.length; i++) {
			for(int j=0; j<hashArray[i]; j++) {
				sb.append((char)('a'+i));
			}
		}
		return sb.toString();
	}

}
