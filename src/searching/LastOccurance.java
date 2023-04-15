package searching;

public class LastOccurance {
	public static int lastOccurance(int[] arr, int x) {
		int low = 0;
		int high = arr.length;
		int res = -1;
		while(low<=high) {
			
			int mid = (low + high)/2;
			
			if(x == arr[mid]) {
				res = mid;
				low = mid+1;
			}
			
			if(x < arr[mid]) {
				high = mid-1;
			}
			
			if(x > arr[mid]) {
				low = mid+1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 5};
		System.out.println(lastOccurance(arr, 4));
		
	}
}
