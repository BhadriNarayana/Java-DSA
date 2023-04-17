package searching;

/* An array (may not be sorted) will be given such that it always includes zero and if
max is the maximum element all the elements from 0 to max will be present in the array and
among them only one element repeats we need to return the repeating element.
We need to solve it in O(n) time.
*/
public class OnlyRepeatingElement {
	static int repElement(int[] arr) {
		
		int n = arr.length;
		boolean[] arr2 = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			arr2[i] = false;
		}
		
		for(int i = 0; i<n; i++) {
			if((arr2[arr[i]]) ==  true) {
				return arr[i];
			}
			
			arr2[arr[i]] = true;
		}
		
		return -1;
		
	
	}
	public static void main(String[] args) {
		int[] arr = {0, 5, 3, 3, 4, 6};
		System.out.println(repElement(arr));
	}

}
