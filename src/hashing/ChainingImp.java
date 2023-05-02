package hashing;

import java.util.ArrayList;
import java.util.LinkedList;
class MyHash{
	int BUCKET;
	
	ArrayList<LinkedList<Integer>> table;
	MyHash(int b) {
		BUCKET = b;
		
		for(int i = 0; i < b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key) {
		int ind = key % BUCKET;
		
		table.get(ind).add((Integer) key);
	}
}
public class ChainingImp {
	
}
