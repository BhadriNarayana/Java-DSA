package hashing;

import java.util.HashMap;
import java.util.Map;
public class HashMapPrac {
	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Narayana");
		hmap.put(2, "Maha Vishnu");
		hmap.put(3, "Vishnu");
		
		hmap.remove(1);
		
		for(Map.Entry<Integer, String> e : hmap.entrySet()) {
			System.out.print(e.getValue() + " ");
		}
		System.out.println();
		System.out.println(hmap);
	
	}

}
