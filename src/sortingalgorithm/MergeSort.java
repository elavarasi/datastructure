package sortingalgorithm;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String args[]){
		
		int[] input = {5,4,2,7,6,8,6,2};
		
//		int size = input.length;
		
		mergesort(input);
		
		
	}
	
	public static void mergesort(int[] input){
		if(input.length > 1){
			
			int middle = input.length / 2;
			
			int[] left = new int[middle];
			for(int i=0; i< middle; i++){
				left[i] = input[i];
			}
			
			int[] right = new int[input.length - middle];
			for(int i=0;i<input.length - middle;i++){
				
				right[i] = input[i+middle];
			}
			
			System.out.println(Arrays.toString(left));
			System.out.println(Arrays.toString(right));
			System.out.println("**");
			mergesort(left);
			mergesort(right);
			
			merge(input,left,right);
			
		}		
	}
	
	
	public static void merge(int[] result, int[] left, int[] right){
		System.out.println("I am inside merge");
		System.out.println("now left is: " + Arrays.toString(left));
		System.out.println("now right is:" + Arrays.toString(right));
		System.out.println("now result array is"+ Arrays.toString(result));
		
		
		
		int i1 = 0;  //index into left array
		int i2 = 0; //index into right array
		
		for(int i=0; i<result.length; i++){
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
			
		}
		System.out.println("final result array is" + Arrays.toString(result));
	}	
	

}
