package interviewbit.chapter2_arrays.arrayMath;

/***
 * 
 * Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 * 
 * Trivial case: 
 * A: [0]   the result should be [1]
 * A : [ 9, 9, 9, 9, 9 ] the result should be [1,0,0,0,0,0]
 * 
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class AddOneToNumber {

	
	public static void main(String args[]){
		
		AddOneToNumber obj1 = new AddOneToNumber();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(9);
		al.add(9);
		al.add(9);
		al.add(9);
		al.add(9);
		al.add(9);
		

		obj1.addone(al);

		
	}
	
	
	public ArrayList<Integer> addone(ArrayList<Integer> a){
		
		if(a.size() == 1 && a.get(0)==0){
			
			a.set(0, 1);
			
			return a;
		}
		
		Iterator<Integer> itr = a.iterator();
		
		while(itr.hasNext() && itr.next() == 0){
				itr.remove();
		}
	

		Collections.reverse(a);
		
		int carryon = 1;
		int sum = 0;
		
		for(int i=0; i < a.size(); i++){		
			sum = a.get(i) + carryon;
			System.out.println("again inside");
			if (sum >= 10){
				a.set(i, 0);
				carryon = 1;
				sum = 0;
				if((i == a.size()-1)){
					a.add(1);
					break;
				}
			} else {
				System.out.println("inside else");
				a.set(i, sum);
				break;
			}				
		}
			
		Collections.reverse(a);

		System.out.println(a);
		return a;
	}
	
	
}




/**
 * 
 * public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    
	    size = A.size();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        
	        num = A.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        A.set(i, num);
	        
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue;
	        res.add(x);
	    }
	    
	    return res;
	    
	}
}
 * 
 * 
 */




