package gaylee.arrays;

/**
 * 
URLi : Write a method to replace all spaces in a string with '%20  You may assume that the string has suffcient space at the end to hold the additional characters, 
and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith   ", 13 Output: "Mr%20John%20Smith"
 *
 *
 *
 *****
 *pseudocode:
 *trim the input string
 *traverse the string and replace space character by %20.
 */


public class urlify {
	
	public static void main(String args[]){
		String str = new String("Mr John Smith    ");
		urlify(str);
	}

	public static String urlify(String str){
		if (str.length()  <0){
			return str;
		}
		
		str = str.trim();
		str = str.replace(" " , "%20");
		System.out.println(str);
		System.out.println(str.length());
		
		
		return str;

	}
	

}
