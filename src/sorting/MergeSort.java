package sorting;

import java.util.Arrays;

public class MergeSort {
	
	static void merge(int[] arr, int l, int m, int h) {
		int[] left = new int[m-l+1];
		int[] right = new int[h - (m+1) +1];
		
		int st = l;
		int i = 0;
		while(i < left.length) {
			left[i] = arr[st];
			st++;
			i++;
		}
		i = 0;
		while(i < right.length) {
			right[i] = arr[st];
			st++;
			i++;
		}
		
		i = 0; int j = 0;
		st = l;
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				arr[st] = left[i];
				i++;
				st++;
			}
			else {
				arr[st] = right[j];
				j++;
				st++;
			}	
		}
		
		while(i < left.length) {
			arr[st] = left[i];
			i++;
			st++;
		}
		while(j < right.length) {
			arr[st] = right[j];
			j++;
			st++;
		}
		
	}
	static void mergeSort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int mid = (low + high)/2;
			
	
			mergeSort(arr, low, mid);
			
			mergeSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
			
		}
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 10, 3, 4, 5, 8};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
