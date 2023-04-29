package multidimensionalArrays;

public class BoundaryTraversal {
	
	static void boundaryTraversal(int[][] arr, int r, int c) {
		
		if(r == 1) {
			for(int i = 0; i < arr[0].length; i++) {
				System.out.print(arr[0][i] + " ");
			}
		}
		else if(c == 1) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][0] + " ");
			}
		}
		else {
			
			for(int i = 0; i < arr[0].length; i++) {
				System.out.print(arr[0][i] + " ");
			}
			
			System.out.println("");
			
			for(int i = 1; i < r; i++) {
				System.out.print(arr[i][c-1] + " ");	
			}
			System.out.println("");
			
			for(int i = c-2; i >=0; i--) {
				System.out.print(arr[r-1][i] + " ");	
			}
			System.out.println("");
			
			for(int i = r-2; i > 0; i--) {
				System.out.print(arr[i][0] + " ");	
			}
			System.out.println("");
		}
		
	}
	public static void main(String args[]) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int r = 4, c = 4;
		boundaryTraversal(arr, r, c);
	}
	
	

}
