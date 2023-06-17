package strings;

public class SubSequence {
	
	
	static boolean isSubsequence(String s1, String s2) {
		
		int i = 0;
		int j = 0;
		
		while(i < s1.length() && j< s2.length()) {
			
			if(s2.charAt(j) == s1.charAt(i)) {
				i++;
				j++;
			}
			
			else {
				i++;
			}
			
			
		}
		
		if(j == s2.length()) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		String s1 = "abcdef";
		
		String s2 = "ade";
		
		System.out.println(isSubsequence(s1, s2));
		
	}

}
