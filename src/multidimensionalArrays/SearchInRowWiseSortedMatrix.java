package multidimensionalArrays;

public class SearchInRowWiseSortedMatrix {
	
	static void search(int[][] arr, int c, int r, int x) {
		int right = c-1;
		
		while(right>=0) {
			
			if(arr[0][right] == x) {
				System.out.println(0 + " " + right) ;
				return;
			}
			
			else if(arr[0][right] > x) {
				right--;
			}
			else {
				for(int i = 0; i < r; i++) {
					if(arr[i][right] == x) {
						System.out.println(i + " " + right);
						return;
					}
				}
			}
			
		}
		System.out.println("Value not present in the matrix");
	}
	
	public static void main(String args[]) {
		
		int[][] arr= {{10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
		search(arr, 4, 4, 29);
		
	}

}
