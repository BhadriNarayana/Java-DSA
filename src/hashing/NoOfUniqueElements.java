package hashing;
import java.util.HashSet;
public class NoOfUniqueElements {
	
	static void uniqueElements(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
	
		System.out.println(set);
		System.out.println("Number of unique elements: " + set.size());
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 5, 8, 2, 1};
		uniqueElements(arr);
	}
}
