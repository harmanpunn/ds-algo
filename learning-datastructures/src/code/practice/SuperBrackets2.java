package code.practice;

public class SuperBrackets2 {

	public static void main(String[] args) {

		String bracket = "()";
		char[] bracketArr = bracket.toCharArray();

		int i = 0;
		int j = bracketArr.length - 1;
		int count = 0;
		while (i < j) {

			while (i < bracketArr.length) {
				if (bracketArr[i] == '(') {
					i++;
					break;
				} else {
					i++;
				}
			}

			while (j > 0) {
				if (bracketArr[j] == ')') {
					
					if(i<=j) {
						count = count + 2;
					}
					j--;
					break;
				} else {
					j--;
				}
			}
		}

		System.out.println(count);
	}

}
