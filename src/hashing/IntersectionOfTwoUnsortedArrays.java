package hashing;
import java.util.HashSet;
public class IntersectionOfTwoUnsortedArrays {
	static void intersection(int[] a, int[] b) {
		
		HashSet<Integer> bset = new HashSet<Integer>(b.length);
		for(int i = 0; i<b.length; i++) {
			bset.add(b[i]);
		}
		
		for(int i = 0; i < a.length; i++) {
			if(bset.contains(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}
	public static void main(String args[]) {
		int[] a = {1, 2, 6, 8, 10};
		int[] b = {10, 20, 1, 8};
		
		intersection(a, b);
	}

}
