package sorting;

import java.util.Arrays;

public class MeetingMaxGuests {
	
	static int meetMaxGuests(int[] arr, int[] dep) {
		
		int curr = 0, res = 0;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i = 0, j = 0;
		
		while(i< arr.length && j< dep.length) {
			
			if(arr[i] < dep[j]) {
				curr++;
				i++;
			}
			else {
				curr--;
				j++;
			}
			
			res = Math.max(curr, res);
			
		}
		
		return res;
	}
	public static void main(String args[]) {
		
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		
		System.out.println(meetMaxGuests(arr, dep));
	}

	
}
