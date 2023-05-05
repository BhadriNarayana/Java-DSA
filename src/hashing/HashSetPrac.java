package hashing;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetPrac {
	
	public static void main(String args[]) {
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(12);
		hset.add(10);
		hset.add(15);
		
		System.out.println(hset);
		
		hset.remove(10);
		System.out.println(hset);
		
		hset.add(25);
		System.out.println(hset);
		System.out.println("Size of our HashSet is " + hset.size());
		
		Iterator<Integer> i = hset.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		
	}

}
