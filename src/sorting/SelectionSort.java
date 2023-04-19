package sorting;

import java.util.Arrays;


public class SelectionSort {
	static void selectionSort(int[] arr, int n) {
		
		for(int j = 1; j<n; j++) {
			int minIdx = j-1;
			for(int i = j; i<n; i++) {
				if(arr[i] < arr[minIdx]) {
					minIdx = i;
				}
			}
			sorting.InsertionSort.swap(arr, j-1, minIdx);
			//arr[j-1] = min;
		}
		
	}
	public static void main(String args[]) {
		int[] arr = {10, 0, 5, 8, 15, -2};
		
		selectionSort(arr, 6);
		
		System.out.println(Arrays.toString(arr));
	}
}
