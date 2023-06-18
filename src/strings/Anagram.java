package strings;
import java.util.Arrays;
public class Anagram {
	
	static boolean anagram1(String s1, String s2) {
		char[] sa1 = s1.toCharArray();
		
		char[] sa2 = s2.toCharArray();
		
		Arrays.sort(sa1);
		Arrays.sort(sa2);
		
		
		s1 = new String(sa1);
		s2 = new String(sa2);
		if(s1.equals(s2)) {
			return true;
		}
		
		System.out.println(sa1.toString());
		
		return false;
	}
	public static void main(String args[]) {
		
		String a = "real";
		
		String b = "lear";
		
		System.out.println(anagram1(a, b));
	}

}
