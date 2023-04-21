package sorting;

import java.util.Arrays;

public class QuickSort {
		
	public static void quickSort(int[] arr, int l, int h) {
		if(l < h) {
			
			int res = sorting.LomutoPartition.lomuto(arr, l, h);
			quickSort(arr, l, res-1);
			quickSort(arr, res+1, h);
			  
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 5, 8, 7, 2, 3, 1};
		quickSort(arr, 0, arr.length-1);
		//sorting.LomutoPartition.lomuto(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
