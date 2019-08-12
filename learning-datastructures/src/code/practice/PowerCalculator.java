package code.practice;

public class PowerCalculator {

	public static void main(String[] args) {
			
		try {
			System.out.println(power(-3,5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	private static long power(int n, int p) throws Exception {
		
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative.");
		} else if (n==0 || p==0) {
			throw new Exception("n and p should not be zero.");
		}
		return (long) Math.pow(n, p);
		
	}
	
}
