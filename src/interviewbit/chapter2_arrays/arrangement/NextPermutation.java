package interviewbit.chapter2_arrays.arrangement;
/**
 * Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

The replacement must be in-place, do not allocate extra memory.

Examples:

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1

20, 50, 113 → 20, 113, 50
Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

 Warning : DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. 
 ************
 Access Hint
It might help to write down the next permutation on paper to see how and when the sequence changes.

You’ll realize the following pattern :

The suffix which gets affected is in a descending order before the change.

A swap with the smaller element happens and then we reverse the affected suffix.

    1 2 3 -> 1 3 2   // Suffix being just the 3. 

    1 2 3 6 5 4  -> 1 2 4 3 5 6 // Suffix being 6 5 4 in this case. 
 * 
 */

/**
 * Your Input:      6 45 54 67 98 34 33 
Expected output is  45 54 98 33 34 67
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
	
	public static void main(String args[]){
		Integer[] input =  
			{ 251, 844, 767, 778, 658, 337, 10, 252, 632, 262, 707, 506, 701, 475, 410, 696, 631, 903, 516, 149, 344, 101, 42, 891, 991 };


		List<Integer> a = new ArrayList<Integer>(Arrays.asList(input));
		
		nextpermutation((ArrayList<Integer>) a);	
	}
	
	
	public static void nextpermutation(ArrayList<Integer> a){		
		System.out.println(a);
		System.out.println("******");
		
		int length = a.size();
		int i = length-1;
		int j = 0;
				
		while(i>0){
			j = i - 1;
			
			if(a.get(j) < a.get(i)){
				System.out.println(i);
				System.out.println(j);
				int temp = a.get(j);
				
				a.set(j, a.get(i));
				a.set(i, temp);
				
				break;
			}
			i--;
		}
		// 854, 59, 422
		System.out.println("*outside **");
		i=a.size()-1;
		System.out.println(i + " " + a.get(i));
		System.out.println(j+ " " + a.get(j));
		System.out.println(a);
		System.out.println("******");
			j++	;	
		int temp = 0;
		while (j<=a.size()-1 &&i<=a.size()-1){
			if(i==j){
				break;
			}
			
			System.out.println("*inside **");
			System.out.println(i + " " + a.get(i));
			System.out.println(j+ " " + a.get(j));
			System.out.println(a);
			System.out.println("******");
			
			temp = a.get(i);

			a.set(i, a.get(j));
			a.set(j,temp);
			i--;
			if(i==j){
				break;
			}
			j++;
		}
		System.out.println("****$$*");
		System.out.println(a);
				
	}

}


/**
	    boolean status;
	    status = nextPerm(A);
	    if (!status)
	        Collections.sort(A);
	    return;
	}
	
	
	public boolean nextPerm(ArrayList<Integer> A) {
	    
	    int i = 0;
	    int n = A.size();
	    
	    for (i = n - 2; i >= 0; i--) {
	        if (A.get(i) < A.get(i + 1))
	            break;
	    }
	    
	    if (i == -1)
	        return false;
	   
	    int j = n - 1;
	    
	    for (; j >= i; j--) {
	        if (A.get(j) > A.get(i))
	            break;
	    }
	    
	    swap(A, i, j);
	    
	    i++;
	    int steps = (n - i + 1) / 2;
	    
	    for (int k = 0; k < steps; k++) {
	        swap(A, i + k, n - k - 1);
	    }
	    
	    return true;
	}
	
	public void swap(ArrayList<Integer> A, int i, int j) {
	    int temp = A.get(i);
	    A.set(i, A.get(j));
	    A.set(j, temp);
	}
	

*/