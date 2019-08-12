package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int myArr[] = selectionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
		for(int i=0; i<myArr.length; i++) {
			System.out.print("->" + myArr[i]);
		}
	}
	
	public static int[] selectionSort(int a[]) {
		for(int i=0; i<a.length; i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min); 
		}
		return a;
	}

	private static void swap(int[] a, int i, int min) {
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
}
