package searching;

public class FirstOccurance {
	
	static int firstOccurance(int[] arr, int x) {
		int high = arr.length;
		int low = 0;
		int res = -1;
		while(low<=high) {
			
			int mid = (high+low)/2;
			
			if(x == arr[mid]) {
				res = mid;
				
				high = mid-1;
			}
			
			if(x > arr[mid]) {
				low = mid+1;
			}
			if(x < arr[mid]) {
				high = mid-1;
			}
			
		}
		return res;
	}
	 public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 2, 2, 3, 4, 5};
		
		System.out.print(firstOccurance(arr, 3));
	}

}
