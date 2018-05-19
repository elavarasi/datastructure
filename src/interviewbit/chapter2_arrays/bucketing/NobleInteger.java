package interviewbit.chapter2_arrays.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {

	public static void main(String args[]){
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(6);
		A.add(7);
		A.add(5);
		A.add(0);
		A.add(-4);
		A.add(-5);
		A.add(-7);
		A.add(7);
		
		
		
		Collections.sort(A);
		 int found = -1;
		System.out.println(A);
		
		int index = (A.size()) /2;
		int numerOfElementsAfterTarget;
		while(index >=0 && index < A.size()-1){
			System.out.println("**inside**");
			numerOfElementsAfterTarget = A.size()-index-1;
			int target=A.get(index);
			System.out.println("steps "+ numerOfElementsAfterTarget);
			System.out.println("index " + index);
			System.out.println("target " + target);
			System.out.println("**1**");
			
			if(target == numerOfElementsAfterTarget){
				System.out.println("yes found");
				found = 1;
				break;
				
			} else if(target > numerOfElementsAfterTarget){
				index--;
			} else {
				index++;
			}
			System.out.println("index " + index);
		
			System.out.println("***2*");
		}


		
		
	}
	
}
