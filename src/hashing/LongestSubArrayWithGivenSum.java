package hashing;
import java.util.HashMap;
public class LongestSubArrayWithGivenSum {
	
	static int longestSubarray(int arr[], int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int min = 0, prefixSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			prefixSum = prefixSum + arr[i];
			
			int diff = prefixSum - sum;
			map.put(prefixSum, i);
			
			if(map.containsKey(diff)) {
				System.out.println(map.get(diff) + " " + i);
				min = Math.max(min, i - (map.get(diff))); 
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		System.out.println(longestSubarray(arr, 9));
	}

	
}
