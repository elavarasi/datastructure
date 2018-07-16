/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

 Note: You have to modify the array A to contain the merge of A and B. Do not output anything in your code.
TIP: C users, please malloc the result into a new array and return the result. 
If the number of elements initialized in A and B are m and n respectively, the resulting size of array A after your code is executed should be m + n

Example :

Input : 
         A : [1 5 8]
         B : [6 9]

Modified A : [1 5 6 8 9]
 */

package interviewbit.TwoPointers;

import java.util.ArrayList;

public class MergeTwoSortedLists {
	public static void main(String args[]) {
		MergeTwoSortedLists obj1 = new MergeTwoSortedLists();
		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(5);
//		a.add(9);
//		a.add(10);
//		a.add(11);
		
		a.add(0);
		a.add(5);
		a.add(9);
		a.add(10);
		a.add(12);
		a.add(33);
//		
		ArrayList<Integer> b = new ArrayList<Integer>();
//		b.add(0);
//		b.add(1);
//		b.add(2);
//		b.add(2);
//		b.add(2);
//		b.add(3);
		
		b.add(1);
		b.add(2);
		b.add(14);
		b.add(35);
		
		ArrayList<Integer> result = obj1.mergeTwoSortedList(a, b);	
		System.out.println(result);
	}
	public  ArrayList<Integer> mergeTwoSortedList(ArrayList<Integer> a, ArrayList<Integer> b) {
		// If A is empty add B to A and return A
		if(a.size()==0) {
			for (int i = 0 ; i<b.size();i++){
			    a.add(b.get(i)) ;
			}
		}
		
		// If B is empty return A
		if(b.size()==0) {
			return a;
		}
		
		// If all elements in B are greater than A, then append B to the end of A and return A
//		if(a.get(a.size()-1) <= b.get(b.size()-1)) {
		if(b.get(0) >= a.get(a.size()-1)) {
			for (int i = 0 ; i<b.size();i++){
			    a.add(a.size(),b.get(i)) ;
			}
			return a;
		}

		
		// If all elements in A are greater than B, then append B to the beginning of A and return A
		if(a.get(0) >= b.get(b.size()-1)) {
			for (int i = b.size()-1; i>=0; i--){
			    a.add(0, b.get(i)) ;			  			   
			}
			return a;
		}
		
		// Two pointers to iterate A and merge B to A
		int i=0;
		int j=0;
		while(i< a.size() && j < b.size()) {
			if(a.get(i) <=b.get(j)) {
				i++;
			} else {
				a.add(i, b.get(j));
				j++;
			}		
		}
		
		System.out.println("current a is");
		System.out.println(a);
		System.out.println(j);
		// Append any remaining B elements to end of A 
		if(j < b.size()) {
			for (int k = j; k<b.size();k++){
			    a.add(a.size(),b.get(k)) ;
			}
		}
	
		return a;	
	}
}
