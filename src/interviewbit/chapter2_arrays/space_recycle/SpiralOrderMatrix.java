package interviewbit.chapter2_arrays.space_recycle;

import java.util.ArrayList;
public class SpiralOrderMatrix {

/*
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:
 [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ] 
 
 

hint:
This is more of a simulation problem.

You need to maintain state indicating which direction you are traversing to ( left to right, right to left, top to down, down to top ) and then know when to change the directions.

Note that in each direction, either row or column remains constant.

Based on the constant row or column, you can predict when to change the direction.
 * 	
 */
	
	
	public static void main (String args[]){
//		
//		int[][] a = new int[3][3];
////		System.out.println(a[0][2]);
////		System.out.println(a[2].length);
//		int value = 1;
//		
//		for(int i=0,j=0; j< 3; j++){
//			a[i][j] = value ++;  
//		}
//		
//		
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				System.out.println(i +" "+ j);
//				System.out.println(a[i][j]);
////				System.out.println("***");
//			}
//		}
//		
		 ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		    int rows, cols;
		    int row, col;
		    
		    int A=3;
		    rows = cols = A;
		    int num = 1;
		    int max = A * A;
		    
		    for (int i = 0; i < rows; i++) {
		        res.add(new ArrayList<>());
		        for (int j = 0; j < rows; j++) {
		            res.get(i).add(0);
		        }
		    }
		    
		    row = col = 0;
		    int dir = 0;
		    int layer = 0;
		    
		    res.get(0).set(0, 1);
		    
		    for (int step = 2; step <= A * A; step++) {
		        
		        switch(dir) {
		            
		            // Go right
		            case 0:
		            	System.out.println("inside case 0");
		                if (col == cols - layer - 1) {
		                    row++;
		                    dir = 1;
		                } else {
		                    col++;
		                }
		                System.out.println(row + "  " + col);		                
		                break;

		           // Go down     
		           case 1:
		        	   System.out.println("inside case 1");
		               if (row == rows - layer - 1) {
		                   dir = 2;
		                   col--;
		               } else {
		                   row++;
		               }
		               System.out.println(row + "  " + col);
		               break;
		               
		           // Go left    
		           case 2:
		        	   System.out.println("inside case 2");
		               if (col == layer) {
		                   row--;
		                   dir = 3;
		               } else {
		                   col--;
		               }
		               System.out.println(row + "  " + col);
		               break;
		               
		           // Go up    
		           case 3:
		        	   System.out.println("inside case 3");
		               if (row == layer + 1) {
		                   dir = 0;
		                   col++;
		                   layer++;
		               } else {
		                   row--;
		               }
		               System.out.println(row + "  " + col);
		               break;
		            
		        }
		        
		        res.get(row).set(col, step);
		        
		    }
		
		for(int i=0;i<3;i++){

			System.out.println(i);
			System.out.println(res.get(i));
			System.out.println("***");

	}
		
	}
	
	
}

/**
 public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    int rows, cols;
	    int row, col;
	    
	    rows = cols = A;
	    int num = 1;
	    int max = A * A;
	    
	    for (int i = 0; i < rows; i++) {
	        res.add(new ArrayList<>());
	        for (int j = 0; j < rows; j++) {
	            res.get(i).add(0);
	        }
	    }
	    
	    row = col = 0;
	    int dir = 0;
	    int layer = 0;
	    
	    res.get(0).set(0, 1);
	    
	    for (int step = 2; step <= A * A; step++) {
	        
	        switch(dir) {
	            
	            // Go right
	            case 0:
	                if (col == cols - layer - 1) {
	                    row++;
	                    dir = 1;
	                } else {
	                    col++;
	                }
	                
	                break;
	                
	           // Go down     
	           case 1:
	               
	               if (row == rows - layer - 1) {
	                   dir = 2;
	                   col--;
	               } else {
	                   row++;
	               }
	               
	               break;
	               
	           // Go left    
	           case 2:
	               
	               if (col == layer) {
	                   row--;
	                   dir = 3;
	               } else {
	                   col--;
	               }
	               
	               break;
	               
	           // Go up    
	           case 3:
	               
	               if (row == layer + 1) {
	                   dir = 0;
	                   col++;
	                   layer++;
	               } else {
	                   row--;
	               }
	               
	               break;
	            
	        }
	        
	        res.get(row).set(col, step);
	        
	    }
	    
	    return res;
	    
	}
}

Close
**/
  
  
