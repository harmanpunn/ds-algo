package code.practice;

public class OccurencesOf2 {

	public static void main(String[] args) {
		
		
		int n = 22;
		int count = 0;
		for(int i=0; i<=n; i++) {
			String str = i+"";
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '2') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
