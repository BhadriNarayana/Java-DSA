package sorting;
//FINDING THE MIN DIFFERENCE B/W TWO ELEMENTS OF AN ARRAY

import java.util.Arrays;

// NAIVE APPROACH: O(N^2) TWO LOOPS 
// OPTMIMAL APPROACH SORT THE ARRAY (N*LOGN)+ FIND DIFFERENCE
public class MinDifference {
	static int minDifference(int[] arr) {
		
		Arrays.sort(arr);
		int min = arr[1] - arr[0];
		for(int i = 1; i < arr.length; i++) {
			min = Math.min(arr[i] - arr[i-1], min);
		}
		return min;
	}
	
	public static void main(String args[]) {
		int[] arr = {1, 10, 20, 15, 18, 6, 4};
		
		System.out.println(minDifference(arr));
	}
}
