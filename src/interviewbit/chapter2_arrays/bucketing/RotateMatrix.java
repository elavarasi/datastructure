package interviewbit.chapter2_arrays.bucketing;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
	
	public static void main(String args[]){
		
//		int[][] inputarray = {{1,9,6},{7,8,4},{3,2,1}};
//		int[][] outputarray = new int[3][3];
//		
//		
//		for(int i=0;i<=inputarray.length-1;i++){
//			int size = inputarray.length-1;
//			for(int j=0;j<=inputarray.length-1;j++){
//				System.out.println("i " + i);
//				System.out.println("j " + j);
//				System.out.println("size " + size);
//				System.out.println("***");
//				outputarray[i][j] = inputarray[size][i];
//				size--;
//			}
//			
//			
//		}
//		
//		System.out.println(Arrays.deepToString(inputarray));
//		System.out.println(Arrays.deepToString(outputarray));
		
		
		
		ArrayList<ArrayList<Integer>> inputarray = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> outputarray = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		row.add(1);
		row.add(9);
		row.add(6);
		
		inputarray.add(row);
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(7);
		row1.add(8);
		row1.add(4);
		
		inputarray.add(row1);
		
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(3);
		row2.add(2);
		row2.add(1);
		
		inputarray.add(row2);
		System.out.println(inputarray);
		
		
		
		
		for(int i=0;i<=inputarray.size()-1;i++){
		int size = inputarray.size()-1;
		ArrayList<Integer> rows = new ArrayList<Integer>();
		for(int j=0;j<=inputarray.size()-1;j++){
			System.out.println("i " + i);
			System.out.println("j " + j);
			System.out.println("size " + size);
			System.out.println("***");
			
			
			rows.add(inputarray.get(size).get(i));
			
			
			size--;
		}
		outputarray.add(rows);
		
	}
	
		System.out.println(inputarray);
		System.out.println(outputarray);

		
		
		
		
	}
	
	
	
}
