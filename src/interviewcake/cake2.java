package interviewcake;

import java.util.Arrays;

/******* Cake 2 *****
You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.

For example, given:

  [1, 7, 3, 4]

your function would return:

  [84, 12, 28, 21]

by calculating:

  [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]

Do not use division in your solution.

 *
 *
 *
 *********************
 * Ela Pseudo
 * Traverse the array once and get the over all product
 * traverse second time and divide each over all product by the current index value and store it in current index.
 * 
 *  Start with a brute force solution, look for repeat work in that solution, and modify it to only do that work once.
 *
 */


public class cake2 {
	public static void main(String args[]){
		
		int[] input = {2,3,2,3,4,5,2,1};
		
		int[] output = new int[input.length];
		
		output[0] = 1;
		output[1] = input[0];
		int product = 1;   //3
		
		for(int i=1; i< input.length; i++) {
			product = product * input [i-1];
			output[i] = product; 
		}
		
		product = 1;
		for(int i=input.length -1; i>0 ; i-- ) {
			output[i] = output[i] * product;
			product = product * input[i];
		}
		
		System.out.println(Arrays.toString(output));
			
	}
}



/***
 *   public int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

    // make sure we have at least 2 numbers
    if (intArray.length < 2) {
        throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
    }

    // we make an array with the length of the input array to
    // hold our products
    int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

    // for each integer, we find the product of all the integers
    // before it, storing the total product so far each time
    int productSoFar = 1;
    for (int i = 0; i < intArray.length; i++) {
        productsOfAllIntsExceptAtIndex[i] = productSoFar;
        productSoFar *= intArray[i];
    }

    // for each integer, we find the product of all the integers
    // after it. since each index in products already has the
    // product of all the integers before it, now we're storing
    // the total product of all other integers
    productSoFar = 1;
    for (int i = intArray.length - 1; i >= 0; i--) {
        productsOfAllIntsExceptAtIndex[i] *= productSoFar;
        productSoFar *= intArray[i];
    }

    return productsOfAllIntsExceptAtIndex;
}
 * 
 * 
 * 
 * 
 */
