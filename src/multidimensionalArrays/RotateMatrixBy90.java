package multidimensionalArrays;

public class RotateMatrixBy90 {
	
	static void rotateBy90(int[][] arr, int r, int c){
		
		for(int j = c-1; j>= 0; j--) {
			for(int i = 0; i < r; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
		
		rotateBy90(arr, 4, 4);
	}

}
