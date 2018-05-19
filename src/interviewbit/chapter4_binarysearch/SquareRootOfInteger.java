/** Ela completed
 * Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY

 NOTE: You only need to implement the given function. 
 Do not read input, instead use the arguments to the function. 
 Do not print the output, instead return values as specified. 
 Still have a doubt? Checkout Sample Codes for more details. 
*/


package interviewbit.chapter4_binarysearch;

import java.math.BigInteger;

public class SquareRootOfInteger {
	public static void main(String args[]) {
		System.out.println("result of 25: "+ sqrt(25));
		System.out.println("result of 11: " + sqrt(11));
		System.out.println("result of 12: " + sqrt(12));
		System.out.println("result of 234: " + sqrt(234));
		System.out.println("result of 111212: " + sqrt(111212));
	}
	//Accepted solution
	public static int sqrt(int a) {
		long low = 1;
		long high = a;
		long result = 0;

		while(low <= high) {
		    long mid = (low + high) / 2;   
			if (mid * mid == a) {   //mid*mid will overflow- so it has to be long
				result = mid;
				break;
			} else if ( mid * mid > a) {
				
				if (high != mid) {
					high = mid;
				} else {
					return (int) mid;
				}
			} else if ( mid * mid < a) {
				if (low != mid) {
					low = mid;	
				} else {
					return (int) mid;
				}	
			}
		};
		return (int) result;
	}
	
	//an attempt with biginteger
	public static BigInteger sqrt1(int x) {            
		BigInteger X =  BigInteger.valueOf(x);
		BigInteger low = BigInteger.valueOf(1);
		BigInteger high = BigInteger.valueOf(x);
		BigInteger result = BigInteger.valueOf(0);

		
		while(low.compareTo(high) == -1 || low.compareTo(high) == 0) {
			System.out.println("*****");
			
			BigInteger mid = (low.add(high)).divide(BigInteger.valueOf(2));
			System.out.println(mid);
//			System.out.println(mid * mid);
			BigInteger midsquare = mid.multiply(mid);
			if (midsquare.compareTo(X) == 0) {
				result = mid;
				break;
			} else if ( midsquare.compareTo(X) == 1) {
				if (!high.equals(mid)) {
					high = mid;
					System.out.println("high: " + high);
				} else {
					return mid;
				}
			} else if (midsquare.compareTo(X) == -1) {
				if (!low.equals(mid)) {
					System.out.println("low: " + low);
					low = mid;	
				} else {
					return mid;
				}	
			}
		};
		return result;	
	}
}






