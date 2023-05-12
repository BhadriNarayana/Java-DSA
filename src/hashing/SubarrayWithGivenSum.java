package hashing;
import java.util.HashSet;
public class SubarrayWithGivenSum {
	static boolean subarrayWithGivenSum(int[] arr, int sum) {
		int prefixSum = 0;
		HashSet<Integer> set = new HashSet<Integer>(arr.length);
		for(int i = 0; i < arr.length; i++) {
			prefixSum = arr[i] + prefixSum;
			set.add(prefixSum);
			if(set.contains(prefixSum - sum)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		System.out.println(subarrayWithGivenSum(arr, 22));
	
	}

}
