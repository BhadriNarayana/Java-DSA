package sorting;

import java.util.Arrays;

// GIVEN AN ARRAY OF UNIQUE NUMBERS, FIND THE KTH SMALLEST ELEMENT
public class KthSmallest {
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int l, int h) {
		
		int pivot = arr[h];
		int i = l-1; // till [i] will have all the elements <= pivot 
		
		for(int j = l; j<h; j++) {
			
			if(arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, h);
		
		return i+1;
	}
	
	static int kthSmallest(int[] arr, int k) {
		
		
		int l = 0; int h = arr.length-1;
		while(l < h) {
			
		int res = partition(arr, l, h);
		
		if(res == k-1) {
			return arr[res];
		}
		
		else if(res > k-1) {
			h = res-1;
		}
		
		else {
			l = res +1;
		}
		
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		//kth smallest element will be at index k-1
		int[] arr = {8, 5, 6, 10, 4, 50, 3, 7, 0};
		
		System.out.println(kthSmallest(arr, 2));
		
		//partition(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
