package strings;

public class Palindrome {
	
	
	static boolean isPalindrome(String s) {
		
		int l = 0;
		int h = s.length()-1;
		
		while(l < h) {
			if(s.charAt(l) != s.charAt(h)) {
				return false;
			}
			
			l++;
			h--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "abbaa";
		
		String s2 = "martram";
		
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
				
		
	}

}
