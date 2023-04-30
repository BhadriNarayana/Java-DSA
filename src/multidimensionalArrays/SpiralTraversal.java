package multidimensionalArrays;

public class SpiralTraversal {
	
	static void spiralTraversal(int[][] arr, int r, int c) {
		/*
		 * IDEA: Onion peeling approach
		 * 
		 * start with 4 variables: top, down, left, right
		 * 
		 */
		
		int top = 0, down = r-1, left = 0, right = c-1;
		
		while(top <= down && left<=right) {
			for(int i = left; i<=right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			System.out.println(" ");
			top++;
			
			for(int i = top; i <= down; i++) {
				System.out.print(arr[i][right] + " ");
			}
			System.out.println(" ");
			right--;
			
			for(int i = right; i >=left; i--) {
				System.out.print(arr[down][i] + " ");
			}
			System.out.println(" ");
			down--;
			
			for(int i = down; i >= top; i--) {
				System.out.print(arr[i][left] + " ");
			}
			System.out.println(" ");
			
			left++;
		}
		
	}
	public static void main(String args[]) {
		
		int[][] arr = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		spiralTraversal(arr, 3, 3);
	}
	
}
