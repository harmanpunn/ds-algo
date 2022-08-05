package code.leetcode.practice;

public class LC_344_Reverse_String {

	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		System.out.println(new String(s));
		
		reverseString(s);
		
		for(char c : s) {
			System.out.print(c + ",");
		}
		

	}
	
	public static void reverseString(char[] s) {
        
        int n = s.length;
        int p = 0;
        int r = n-1;;
        
        while(r>=p) {
            swap(s, p, r);
            r--;
            p++;
        }
    }
	
	private static void swap(char[] inputArray, int j, int i) {
		char temp = inputArray[j];
		inputArray[j] = inputArray[i];
		inputArray[i] = temp;
	}

}
