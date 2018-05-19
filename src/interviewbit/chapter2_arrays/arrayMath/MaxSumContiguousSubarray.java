package interviewbit.chapter2_arrays.arrayMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Max Sum Contiguous SubarrayBookmark Suggest Edit

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:
Given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
For this problem, return the maximum sum.

Brute-force algorithm O(n3) and O(n2)
Divide and Conquer O(nlogn)
Kadane's Algorithm - but atleast one positive value should be there.


 */

//A : [ -120, -202, -293, -60, -261, -67, 10, 82, -334, -393, -428, -182, -138, -167, -465, -347, -39, -51, -61, -491]


public class MaxSumContiguousSubarray {

	public static void main(String args[]){
		int inputarr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(-2);
		input.add(1);
		input.add(-3);
		input.add(4);
		input.add(-1);
		input.add(2);
		input.add(1);
		input.add(-5);
		input.add(4);
		
		
		
		System.out.println(input.size());
		int result = Integer.MIN_VALUE;
		for(int subarray_start=0;subarray_start<input.size();subarray_start++){
		int	sum = 0;
		
			for(int subarray_size=1; subarray_size <= input.size(); subarray_size++){
				
				if(subarray_start + subarray_size > input.size()) {
					break;
				}
				sum = sum + input.get(subarray_start + subarray_size -1) ;
				result = Math.max(result,sum);System.out.println(result);
				System.out.println(result);
			}
			
			System.out.println("*****");
		}	
	}
}


/**
 * public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> A) {
	    
	    int sum = Integer.MIN_VALUE;
	    int last = 0;
	    
	    for (int num : A) {
	        
	        last += num;
	        sum = Math.max(sum, last);
            if (last < 0)
	            last = 0;
	    }
	    
	    return sum;
	    
	}
}
 * 
 * 
 */
