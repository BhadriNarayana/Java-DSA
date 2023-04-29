package multidimensionalArrays;

import java.util.Arrays;

public class Implementation {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		int c = 1;
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = c;
				c++;
				
			}
		}
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
	}

}
