package searching;

public class TwoPointerApproach {
	static boolean twoPointerApproach(int[] arr, int sum) {
		int low = 0;
		int high = arr.length-1;
		
		while(low < high) {
			int sum2 = arr[low] + arr[high];
			
			if(sum2 == sum) {
				return true;
			}
			if(sum2 < sum) {
				low++;
			}
			
			if(sum2>sum) {
				high--;
			}
			
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(twoPointerApproach(arr, 11));
	}

}
