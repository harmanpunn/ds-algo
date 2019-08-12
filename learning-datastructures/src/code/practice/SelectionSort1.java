package code.practice;

public class SelectionSort1 {  
    public static void selectionSort(int[] arr){  
    	int swap = 0;
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;//searching for lowest index 
                    swap++;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
        System.out.println("SWap: " + swap);
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  