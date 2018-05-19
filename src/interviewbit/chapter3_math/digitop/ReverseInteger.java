
//come back again
package interviewbit.chapter3_math.digitop;

import java.util.Arrays;

/*
Reverse digits of an integer.

Example1:
x = 123,

return 321
Example2:
x = -123,
return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer
 * 
 * 
 */
public class ReverseInteger {

		public int reverse(int A) {
		    int reverse = A;
		    int sign = 1;
		    
		    if (A < 0) {
		        A *= -1;
		        sign = -1;
		    }
		    
		    reverse = reverseOf(A);
		    
		    if (reverse == Integer.MIN_VALUE)
		        return 0;
		    
	        reverse *= sign;
	        
		    return reverse;
		    
		}
		
		public int reverseOf(int num) {
		    
		    int newNum = 0;
		    
		    while (num > 0) {
		        int digit = num % 10;
		        
		        if (newNum > Integer.MAX_VALUE / 10 || ((newNum == Integer.MAX_VALUE / 10) && digit > Integer.MAX_VALUE % 10)) {
		            return Integer.MIN_VALUE;
		        }
		        
		        newNum = newNum * 10 + digit;
		        num /= 10;
		    }
		    
		    return (int) newNum;
		    
	}
		

	
	
	
	
	
//	public static void main(String args[]){
//		
//		int N = -1146467285;
//		boolean negative = false;
//		
//		char[] chars = String.valueOf(N).toCharArray();
//		
//		if(chars[0] == '-'){
//			negative = true;
//			chars = Arrays.copyOfRange(chars,1,chars.length);
//			System.out.println(chars);
//		}
//		
//		int j=chars.length-1;
//		char temp = ' ';
//		for(int i=0;i<=chars.length-1;i++){
//			System.out.println(i);
//			System.out.println(j);
//			
//			if(j<=i){
//				break;
//			}
//			
//			temp = chars[i];
//			chars[i] = chars[j];
//			chars[j]= temp;
//			j--;
//			System.out.println("****");	
//		}
//		
//		System.out.println("***ela");
//		System.out.println(Integer.parseInt(String.valueOf(chars)));
//		
//		
//		
//	
//		try{
//			
//			Integer result = Integer.parseInt(String.valueOf(chars));	
//		} catch (NumberFormatException e) {
//	           System.out.println("This is not a number");
//	           System.out.println(e.getMessage());
//	        }
		
	
	
//		if(negative) {
//			result = - result;
//		}
//		
//		System.out.println(result);
//	}
	
}
/**
 * Hint:
 * Here are some good questions to ask before coding.

If the integer’s last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

Tips:
1) num % 10 gives you the last digit of a number.
2) num / 10 gives you the number after removing the last digit.
3) num * 10 + digit appends the digit at the end of the number.
 * 
 */
