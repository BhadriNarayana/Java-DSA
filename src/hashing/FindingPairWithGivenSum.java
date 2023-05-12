package hashing;

import java.util.HashSet;
public class FindingPairWithGivenSum {
	static boolean pairWithSum(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<Integer>(arr.length);
		for(int i = 0; i< arr.length; i++) {
			int diff = sum - arr[i];
			
			if(set.contains(diff)) {
				return true;
			}
			else {
				set.add(arr[i]);
			}
		}
		
		return false;
	}
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		System.out.println(pairWithSum(arr, 13));
		
	}

}
