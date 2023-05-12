package hashing;
import java.util.HashSet;
public class SubArrayWithZeroSum {
	static boolean zeroSumSubarray(int[] arr) {
		int sum = 0;//Considering prefix sum
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
			boolean flag = set.add(sum);
			
			if(flag == false) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, -4, 5, 7, 8};
		
		System.out.println(zeroSumSubarray(arr));
	}

}
