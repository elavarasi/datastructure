package sortingalgorithm;

import java.util.Arrays;

public class InsertionSort {

public static void main(String args[]){
	
	int[] inputarray = {5,8,2,1,7,6,9};
	int key = 0;
	
	for(int i=1; i<inputarray.length;i++){
		int j = i;
		key = inputarray[i];
		
		while(j>0){
			if(key < inputarray[j-1]){
				inputarray[j] = inputarray[j-1];
				inputarray[j-1] = key;
				j--;
			} else {
				inputarray[j] = key;
				break;
			}	
		}
	}
	
	System.out.println(Arrays.toString(inputarray));
	
		
}


}
