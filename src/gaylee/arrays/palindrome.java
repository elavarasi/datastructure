package gaylee.arrays;

import java.util.Arrays;

/**
 * 
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. 
 * A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 
 *
 *input:  Tact Coa
 *output: true  ("taco cat", "atco cta".. etc)
 *
 *
 *hint: if even then same characters twice. if length is odd, then only one character with odd count.
 *
 *pseudocode
 *get length
 *if even then using an integer array set the numbers. all should be even
 *if odd then set integer array, all should be even number except 1 which should be of count 1.
 *
 */

public class palindrome {
	public static void main(String args[]){
		String str = new String("TACT COBBCCA112");
		
		System.out.println(isPalindromePermutation(str));
		
	}

	public static boolean isPalindromePermutation(String str){
		
		
		int length = 0;
		char[] chararr = str.toCharArray();
		int[] intarr = new int[128];
		
		for(int i=0;i<str.length();i++){

			str = str.replace(" ", "");
			str = str.toUpperCase();
			length = str.length();
			
			
			int val = str.charAt(i);
			System.out.println(val);
			System.out.println(str.charAt(i));
			
			intarr[val] ++;
			System.out.println("*******");	
			
		}
				System.out.println(Arrays.toString(intarr));
		
		int counter = 0;
		
		for(int i=0; i< intarr.length; i++){
			if(length %2 ==0 ){
				if(intarr[i] % 2 == 1){
					return false;
				}
			} else if (length %2 == 1){
				if(intarr[i] % 2 == 1){
					counter ++;
				}
			}
		}
		
		if(counter > 1) {
			return false;
		}

		
		return true;
		
	}

	
}
