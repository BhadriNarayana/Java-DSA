package searching;

public class PeakElement {
	static int getPeak(int arr[], int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
				(mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			if(mid > 0 && arr[mid - 1] >= arr[mid])
				high = mid -1;
			else
				low = mid + 1;
		}
		
		return -1;
	}
	public static void main(String args[]) {
		
		int[] arr = {1, 5, 1, 100, 8};
		
		System.out.println(getPeak(arr, 5));
	}
}
