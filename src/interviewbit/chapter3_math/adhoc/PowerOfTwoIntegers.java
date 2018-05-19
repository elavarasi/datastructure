package interviewbit.chapter3_math.adhoc;
/*
 *Ela solution worked as well 
Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 
 */


public class PowerOfTwoIntegers {

	public static void main(String args[]){
		int N = 1024000000;
		boolean possible = false;
		System.out.println(Math.sqrt(N));
		if(N==1){
			possible = true;
		}
		
		for(int i=2;i<=Math.sqrt(N);i++){
			double result = 1;
			while(result<N){

				result = result * i;
				if(result == N){
					possible = true;
				}
				
				System.out.println(result);
				
			}
			System.out.println("****");
			
		}
		System.out.println("possible " + possible);
	}
	

}


/***Hint
 * 
For B = 2, number of possibilities = sqrt(INT_MAX) = sqrt(2^31 - 1) < 2^16.
For B = 3, number of possibilities = INT_MAX**1/3 < 2^11
For B = 4, number of possibilities = INT_MAX**1/4 < 2^8
.
.
.
For B = 32, number of possibilities = 0 ( Not considering 1 as its considered in the first case, and 2^32 exceeds INT_MAX ). 

So, the total number of possibilities are less than 10^5.

Now, we just need to iterate on these possibilities and see if we find X = A^B.

Take extra care to make sure there are no overflows.
 * 
 * 
 * 
 */




//Solution
/*
 * public class Solution {
    public boolean isPower(int A) {
        double x=2;
	    double i;
	    if(A==1) return true;
	    for(i=2;(i<33)&&(x<=(double)(Math.pow(2,16)));i++)
	    {   
	        if(Math.pow(x,i)==(double)A) return true;
	        if(Math.pow(x,i) >= (Math.pow(2,32))) {i=1;x++;}
	    }
	    return false;
    }
}

 * 
 * 
 */
