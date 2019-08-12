package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int myArr[] = insertionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
		for(int i=0; i<myArr.length; i++) {
			System.out.print("->" + myArr[i]);
		}
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println("");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

	private static int[] insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int j = i-1;
			int element = a[i];
			while(j>=0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}

}
