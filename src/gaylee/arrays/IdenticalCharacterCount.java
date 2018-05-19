package gaylee.arrays;

import java.util.Arrays;


/**
 * 
 * Check if the two strings have identical character counts.
	We can also use the definition of a permutation-two words with the same character counts-to imple­ ment this algorithm. 
	We simply iterate through this code, counting how many times each character appears. Then, afterwards, we compare the two arrays.
 *
 */
public class IdenticalCharacterCount {
	public static void main(String args[]){
		String s = "elavarasi";
		String t = "elavarasi";
		permutation(s,t);
	}
	
	
	static boolean permutation(String s, String t){
		
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[128];
		
		char[] s_array = s.toCharArray();
		for(char c: s_array){
			System.out.println(c);
			System.out.println(letters[c]);
			letters[c]++;   /// note this ..how to increment an integer in an array by passing a character which gets the character position..
			System.out.println(letters[c]);
			System.out.println("****");
		}
		
		for(int i=0;i< t.length();i++){
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0){
				return false;
			}
		}
		
		System.out.println(Arrays.toString(letters));
		return true;
		
	}

}
