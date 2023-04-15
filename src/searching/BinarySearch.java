package searching;

public class BinarySearch {
	public static int binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (high + low)/2;
			
			if (x == arr[mid]) {
				return mid;
			}
			if (x>arr[mid]) {
				low = mid+1;
			}
			
			if (x< arr[mid]) {
				high = mid -1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(binarySearch(arr, 6));
	}
}
