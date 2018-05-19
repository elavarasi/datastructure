package interviewbit.chapter3_math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Given a number N, find all factors of N.
Example:

N = 6 
factors = {1, 2, 3, 6}
Make sure the returned array is sorted.
 * 
 *
 */
public class AllFactors {
	public static void main(String args[]){
		int N = 82944;
		ArrayList<Integer> s = new ArrayList<Integer>();

		if(N==1){
			s.add(1);
			
		} else {
			
			int sqrrootofnumber = (int) Math.sqrt(N);
			System.out.println("sqrroot" + sqrrootofnumber);
			for(int i=1;i<=sqrrootofnumber;i++){


				if(N%i ==0){
					System.out.println("i: " + i);
					System.out.println("N/i: " +N/i);
					s.add(i);
					if(i!=N/i){
						s.add(N/i);	
					}
					
				}
			}	
		}

		Collections.sort(s);
		System.out.println(s);
	}
	
}
