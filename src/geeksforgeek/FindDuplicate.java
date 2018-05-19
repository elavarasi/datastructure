package geeksforgeek;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String args[]){
		int[] input = {5,7,5,2,3,2,8,9};
		
		   int i;  
		   int arr[] = {4, 2, 4, 51, 2, 3, 1};
	        int size = arr.length;
	        
	        System.out.println("The repeating elements are : ");
	    
	        for (i = 0; i < size; i++)
	        {
	        	System.out.println(Math.abs(arr[i]));
	        	System.out.println(arr[Math.abs(arr[i])]);
	            if (arr[Math.abs(arr[i])] >= 0)
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	            else
	                System.out.print(Math.abs(arr[i]) + " ");
	           	System.out.println(Arrays.toString(arr));
	            System.out.println("********8");
	        }   
	}
	
}
