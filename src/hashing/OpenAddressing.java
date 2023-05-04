package hashing;

import java.util.Arrays;

// we assume that the empty slots are denoted by -1 and deleted slots are represented by -2
// and we also assume that the keys cannot be -1 and -2 or negative


class HashOpenAddressing{
	int CAPACITY;
	int size = 0;
	int[] arr;
	HashOpenAddressing(int c){
		CAPACITY = c;
		arr = new int[CAPACITY];
		for(int i = 0; i < CAPACITY; i++ ) {
			arr[i] = -1;
		}
	}
	int hash(int key) {
		return key % CAPACITY; 
	}
	
	
	boolean search(int key) {
		int h = hash(key);
		int pos = h;
		
		if(arr[pos] == key) {
			return true;
		}
		pos = h + 1;
		while(pos != h && arr[pos]!= -1) {
			
			if(arr[pos] == key) {
				return true;
			}
			pos = (pos + 1) % CAPACITY;
		}
		return false;
	}
	
	boolean delete(int key) {
		
		int h = hash(key);
		
		int pos = h;
		
		if(arr[pos] == key) {
			arr[pos] = -2;
		}
		pos = h + 1;
		
		while(pos!= h && arr[pos] == -1 && arr[pos] == -2) {
			if(arr[pos] == key) {
				arr[pos] = -2;
			}
			pos = (pos+1)%CAPACITY;
		}
		return false;
	}
	boolean insert(int key) {
		int h = hash(key);
		
		if(size >= CAPACITY) {
			return false;
		}
		int pos = h;
		
		while(arr[pos] != -1 && arr[pos] != -2) {
			
			if(arr[pos] == key) {
				return false; // IF ELEMENT ALREADY EXISTS THEN RETURN FALSE
			}
			pos = (pos + 1) % CAPACITY;
		}
		arr[pos] = key;
		size++;
		return true;
	}
}


public class OpenAddressing {
	
	
	public static void main(String args[]) {
		HashOpenAddressing a = new HashOpenAddressing(7);
		
		a.insert(20);
		a.insert(16);
		a.delete(16);
		a.insert(23);
		a.insert(16);
		
		System.out.println(Arrays.toString(a.arr));
		System.out.println(a.search(5));
	}

}
