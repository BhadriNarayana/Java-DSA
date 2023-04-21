package sorting;

import java.util.Arrays;

public class LomutoPartition {
	
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
	static int lomuto(int[] arr, int l, int h) {//considers last element as pivot and places it in its sorted position
		int n = h-l+1;
		int pivot = arr[n-1];
		int i = l-1;
		
		while(l <= h) {
			if(arr[l] < pivot) {
				i++;
				swap(arr, i, l);
			}
			l++;
		}
		
		swap(arr, h, i+1);
		return i+1;
	}
		 
	public static void main(String args[]) {
		int[] arr = {1, 8, 15, 30, 3, 10};
		
		System.out.println(lomuto(arr, 0, arr.length-1));
		
		System.out.println(Arrays.toString(arr));
	}
}
