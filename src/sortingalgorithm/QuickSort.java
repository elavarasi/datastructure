package sortingalgorithm;

import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]){
		int[] input = {10,80,30,90,32,56,43,52};
//		int[] input = {10,80};
		int start = 0;
		int end = input.length-1;
		quickSort(input,0,end);
		System.out.println("**final ");
		System.out.println(Arrays.toString(input));
		
	}
	
	public static void quickSort(int[] input,int left, int right){

		
		if(left>=right){
			return;
		}
		
		int middle = (left+right)/2 ;
		System.out.println("middle "+ middle);
		int pivot = input[middle];
		System.out.println("pivot is "+ pivot);
		int index = partition(input,pivot, left,right);
		
		System.out.println("partition inde is"+ index);
		
		
		quickSort(input,left,index-1);
		quickSort(input,index,right);
		
		
	}
	
	public static int partition(int[] input,int pivot,int left,int right){
		

		while(left <= right){
			System.out.println("left " + left);
			System.out.println("right " + right);
			while(input[left] < pivot){
				left++;
			}
			while(input[right]>pivot){
				right--;
			}
			
			if(left <= right){
				System.out.println("inside swapping");
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left ++;
				right --;
			}
						
		}
		return left;

	}
	
	
}
