package multidimensionalArrays;

import java.util.Arrays;

public class TransposeEfficient {
	
	static void transposeEff(int[][] arr, int r, int c) {
		//IDEA IS TO JUST SWAP THE DIAGONALLY OPPOSITE ELEMENTS
		
		//Travel only upper triangular matrix and swap it with corresponding lower traingular matrix
		
		for(int i = 0; i < r; i++) {
			for(int j = i+1; j < c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			
		}
	}
	public static void main(String[] args) {
		
		int[][] arr= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		transposeEff(arr, 3, 3);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
