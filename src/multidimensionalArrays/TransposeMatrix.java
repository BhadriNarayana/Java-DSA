package multidimensionalArrays;

public class TransposeMatrix {
	
	static void transpose(int[][] arr,int r,int c) {
		
		for(int j = 0; j < c; j++) {
			for(int i = 0; i < r; i++) {
			System.out.print(arr[i][j] + " ");
		}
			System.out.println(" ");
			}
		
		
	}
	public static void main(String[] args) {
		
		int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		
		transpose(arr, 4, 3);
	}

}
