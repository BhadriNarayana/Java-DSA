package multidimensionalArrays;

import java.util.Arrays;

public class RotateBy90Eff {
	static void rotateBy90Eff(int[][] arr, int r, int c) {
		//step - 1 : Transpose
		//step -2:  Reverse the rows
		
		for(int i = 0; i < r; i++) {
			for(int j = i+1; j < c; j++) {
				int temp = arr[i][j];
				arr[i][j] =arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		int low = 0, high = c-1;
		
		while(low < high) {
			for(int i = 0; i < c; i++) {
				int temp = arr[low][i];
				arr[low][i] = arr[high][i];
				arr[high][i] = temp; 
			}
			low++;
			high--;
		}
	}
	public static void main(String args[]) {
		
		int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
		
		rotateBy90Eff(arr, 4, 4);
		for(int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
