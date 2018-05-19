package interviewbit.chapter2_arrays.simulationArray;

import java.util.ArrayList;

/**Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
 * 
Did you account for base cases like numRows = 0, numRows = 1?

Alright, once we have that out of the window, let us look at how we can approach this problem.

Notice that the first and last numbers in each row ( for row >= 2 ) are 1 and 1.

For all the other numbers:

num at position i = number at position i in prev row + number at position (i + 1) in previous row.
 */

public class PascalTriangleRows {
	public static void main(String args[]){
		int n = 4;
		int sum = 1;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int size = 1;
		
	
		for(int i=0;i<n;i++){
			result.add(new ArrayList<Integer>());
			
			
			for(int j=0;j<=i;j++){			

				if(i==0){
					result.get(i).add(1);
				}
				if(i==1){
					result.get(i).add(1);
				}
				
				if(i>=2){
					if(j==0 || j == i){
						result.get(i).add(1);
					} else if(j == i){
						result.get(i).add(1);
					} else {
						int currentvalue = result.get(i-1).get(j) + result.get(i-1).get(j-1);
						result.get(i).add(currentvalue);
					}			

				}
			}
		
		}
		System.out.println(result);
		
	}

}

/** 
 * public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int A) {
	    int numRows = A;
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    
	    if (A == 0)
	        return res;
	    
	    res.add(new ArrayList<>());
	    res.get(0).add(1);
	    
	    for (int i = 1; i < numRows; i++) {
	        
	        res.add(new ArrayList<>());
	        
	        res.get(i).add(1);
	        
	        for (int j = 0; j < i - 1; j++) {
	            int num = res.get(i - 1).get(j) + res.get(i - 1).get(j + 1);
	            res.get(i).add(num);
	        }
	        
	        res.get(i).add(1);
	        
	    }
	    
	    return res;
	}
}

 * 
 * 
 */
