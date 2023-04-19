package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static void swap(int[] arr, int i, int j) {
		int temp =  arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void insertionSort(int[] arr, int n) {
		
		for(int i = 1; i<n; i++) {
			for(int j = i; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		
	}
	public static void main(String args[]) {
		
		int arr[] = {4, 1, 3, 0, 5};
		insertionSort(arr, 5);
		System.out.println(Arrays.toString(arr));
		
	}

}
