package hashing;
import java.util.HashMap;
import java.util.Map.Entry;
public class FrequencyOfElements {
	
	public static void frequencyElements(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> e : map.entrySet()) {
			System.out.print(e.getKey() + " " + e.getValue());
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 4 ,1 ,2};
		
		frequencyElements(arr);
	}

}
