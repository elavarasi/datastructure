/**  Done
 * Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

 Example: 
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2]. 
 */
package interviewbit.TwoPointers;

import java.util.ArrayList;

public class removeDuplicates {	
	public static void main(String args[]){
		removeDuplicates obj1 = new removeDuplicates();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(3);
		
		int result = obj1.removeDuplicatesMethod(a);
		System.out.println(result);
		
	}
	
	public int removeDuplicatesMethod(ArrayList<Integer> A) {
		  	int n = A.size();
	        if (n == 0 || n == 1)
	            return n;
	      
	        // To store index of next unique element
	        int j = 0;
	      
	        // Doing same as done in Method 1
	        // Just maintaining another updated index i.e. j
	        for (int i = 0; i < n-1; i++) {
	            if (!(A.get(i).equals(A.get(i+1)))) {
	            	A.set(j++, A.get(i));
	            	
	            }	        	
	        }   
	        A.set(j++, A.get(n-1));	      
	        return j;		 	
	}
}

