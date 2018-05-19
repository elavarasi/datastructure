package interviewbit.chapter3_math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Given a number N >= 0, find its representation in binary.

Example:

if N = 6,

binary form = 110
 * 
 *
 */
public class BinaryRepresentation {
	public static void main(String args[]){
		int N = 1;
		
		StringBuffer s = new StringBuffer();
		if(N==0){
			s.append(0);
		}
		
		while(N>0){
			int quotient = N/2;
			int reminder = N%2;
			
			System.out.println(quotient);
			System.out.println(reminder);
			
			s.append(reminder);
			N = quotient;
			
		}

		System.out.println(s.reverse().toString());
		
	}

}
