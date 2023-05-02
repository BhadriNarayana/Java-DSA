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
	
	void remove(int key) {
		int ind = key % BUCKET;
		
		table.get(ind).remove((Integer) key);
	}
	
	boolean search(int key) {
		int ind = key % BUCKET;
		
		return table.get(ind).contains((Integer) key);
	}
}
public class ChainingImp {
	
}
