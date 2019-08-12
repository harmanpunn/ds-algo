package code.practice;

public class PalindromString {

	public static void main(String[] args) {
		
		String str = "harman";
		
		char[] strArr = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i=strArr.length-1; i>=0; i-- ) {
			
			sb.append(strArr[i]);
		}
		
		String isPalindrom = sb.toString().equalsIgnoreCase(str) ? "YES" : "NO";
		System.out.println(isPalindrom);
	}

}
