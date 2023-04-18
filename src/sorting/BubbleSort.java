package sorting;

import java.util.Arrays;

public class BubbleSort {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void bubbleSort(int[] arr, int n) {
		
		for(int j = 0; j < n-1; j++) {
			for(int i = 1; i < n-j; i++) {
				if(arr[i] < arr[i-1]) {
					swap(arr, i, i-1);
				}
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {1, 2, 4, 3, 5, -1, -2};
		bubbleSort(arr, 7);
		System.out.println(Arrays.toString(arr));
	}
}
