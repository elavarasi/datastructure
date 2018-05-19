package gaylee.arrays;

//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

//ask if it is an ascii sting or an unicode string.
/**
 * 
One solution is to create an array of boolean values, where the flag at index i indicates whether character i in the alphabet is contained in the string. The second time you see this character you can immediately return false.
We can also immediately return false if the string length exceeds the number of unique characters in the alphabet. After all, you can't form a string of 280 unique characters out of a 128-character alphabet.
It's also okay to assume 256 characters. This would be the case in extended ASCII. You should clarify your assumptions with your interviewer.
 *
 */

public class IsUnique1 {

	public static void main(String args[]){
		String str = "Elavarasi";
		
		System.out.println(isUniqueString(str));
		
	}

	static boolean isUniqueString(String str){
		
		
		if(str.length() > 128){
			return false;
		}
		
		boolean[] char_set = new boolean[128];   ////  boolean array of size 128 with all false. just to represent 128 character positions and mark them
		
		
		System.out.println(char_set);
		
		for(int i=0;i<str.length();i++){    
			int val = str.charAt(i);    ///gets the character from the string at the given position. It gives the ascii value.  Look at the int here. If it was char then it will only give the character at the position. The int will give the integer or ascii value of the character.
			
			if(char_set[val]){
				return false;
			}
			
			char_set[val] = true;
			
			System.out.println(val);
		}
		
		return true;
		
	}
	
}
