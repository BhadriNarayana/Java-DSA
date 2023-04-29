package sorting;

import java.util.Arrays;

public class CycleSort {
	
	static void cycleSort(int[] arr) {
		int pos = 0;
		int item = arr[pos];
		
		while(pos < arr.length) {
	
			int count = 0;
			for(int i = pos+1; i< arr.length; i++) {
				if(arr[i] < item) {
					System.out.println(arr[i]);
					count++;
				}
			}
			
			if(count == 0) {
				arr[pos] = item;
				pos++;
			}
			else {
				System.out.println("count" + count);
				int temp = arr[count + pos];
				arr[count + pos] = item;
				System.out.println("arr[c+p]"+ arr[count + pos]);
				item = temp;
				System.out.println("item"+ item);
			}
		}
		
		
		
	}

	public static void main(String args[]) {
		int[] arr = {10, 5, 4, 6, 1};
		//System.out.println(arr[2+1]);
		
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));

		
		
		
	}
}
