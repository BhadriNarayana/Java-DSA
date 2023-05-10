package hashing;
import java.util.HashSet;
import java.util.Iterator;
public class UnionOfTwoUnsortedArrays {
	
	static void union(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>(a.length+b.length);
		for(int i = 0; i< a.length; i++) {set.add(a[i]);}
		for(int i = 0; i< b.length; i++) {set.add(b[i]);}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
	}
	public static void main(String args[]) {
		int[] a = {1, 2, 3, 4, 5, 6, 10, 20, 50, 80};
		int[] b = {1, 2, 3, 10, 20, 80};
		
		union(a, b);
	}

}

// TC = O(a + b) AS = O(a+b)