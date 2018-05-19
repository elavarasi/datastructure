package interviewbit.chapter2_arrays.space_recycle;

import java.util.ArrayList;

public class AntiDiagonals {

	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> dummy = new ArrayList<Integer>();
		dummy.add(1);
		dummy.add(2);
		dummy.add(3);
		input.add(dummy);
		
		ArrayList<Integer> dummy1 = new ArrayList<Integer>();
		dummy1.clear();
		dummy1.add(4);
		dummy1.add(5);
		dummy1.add(6);
		input.add(dummy1);
		
		ArrayList<Integer> dummy2 = new ArrayList<Integer>();		
		dummy2.clear();
		dummy2.add(7);
		dummy2.add(8);
		dummy2.add(9);
		input.add(dummy2);
		
		System.out.println(input);
		
		
		
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int l = input.size();
		System.out.println("l: " + l);
		
		
		for(int i=0;i< 2 * l-1; i++){
			int offset = i < l ? 0 : i-l+1;
			System.out.println("offset: " + offset); 
			ArrayList<Integer> row = new ArrayList<Integer>();
			
			for(int j = offset; j<= i-offset; ++j){
				row.add(input.get(j).get(i-j));
			}
			System.out.println("row: " + row); 
			result.add(row);
			System.out.println("******"); 
		}
		System.out.println(result);
	}
	
}
