package code.practice;

public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println(reverse(-321));

	}
	
	public static int reverse(int n) {
        
        boolean neg = false;
		if(n<0) {
			neg = true;
			n = -1*n;
		}
		double reverse = 0; 
		while(n>0) {
			int lastDigit = n%10;
            n = n /10;
			if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
				reverse = 0; 
			} else if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) { 
				reverse = 0; 
			} else {
				reverse = (reverse * 10) + lastDigit;
			}
		}
		
		if(neg) reverse *= -1;
    
    if(-2147483648 > reverse && reverse > 2147483647  ) return 0;
			
    
    return (int) reverse;
	}

}
