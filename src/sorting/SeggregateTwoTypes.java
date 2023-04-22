package sorting;

import java.util.Arrays;

public class SeggregateTwoTypes {
	static void seggregateTwoTypesEven(int[] arr) {
		int j = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 12,  9, 7, 8};
		seggregateTwoTypesEven(arr);
		System.out.println(Arrays.toString(arr));
	}
}
