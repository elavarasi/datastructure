package interviewcake;

/** 
Given an array of integers, find the highest product you can get from three of the integers.
The input arrayOfInts will always have at least three integers.
 *
 */

public class cake3 {
	public static void main(String args[]){
		int[] input = {1,4,5,2,4,5,6,3,2,4,-5,-6};
		
		int first = 0;
		int second = 0; 
		int third = 0;
		
		System.out.println(input.length);
		
		for (int i=0; i < input.length; i++){

			
			
			if(first < input[i]){
				first = input[i];
				
				continue;
			}
			
			if(second < input[i]){
				second = input[i];
				
				continue;
			}
			
			if(third < input[i]){
				third = input[i];
				
				continue;
			}

			
			
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("******");
		
		System.out.println(first * second * third);
		
		
	}
	

}


/**
 * 
 * Solution
We use a greedy ↴ approach to solve the problem in one pass. At each iteration we keep track of:

highestProductOf3
highestProductOf2
highest
lowestProductOf2
lowest
When we reach the end, the highestProductOf3 is our answer. We maintain the others because they're necessary for keeping the highestProductOf3 up to date as we walk through the array. At each iteration, the highestProductOf3 is the highest of:

the current highestProductOf3
current * highestProductOf2
current * lowestProductOf2 (if current and lowestProductOf2 are both low negative numbers, this product is a high positive number).

  
solution give:
  
  public int highestProductOf3(int[] arrayOfInts) {
    if (arrayOfInts.length < 3) {
        throw new IllegalArgumentException("Less than 3 items!");
    }


    // We're going to start at the 3rd item (at index 2)
    // so pre-populate highests and lowests based on the first 2 items.
    // we could also start these as null and check below if they're set
    // but this is arguably cleaner
    int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
    int lowest  = Math.min(arrayOfInts[0], arrayOfInts[1]);

    int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
    int lowestProductOf2  = arrayOfInts[0] * arrayOfInts[1];

    // except this one--we pre-populate it for the first *3* items.
    // this means in our first pass it'll check against itself, which is fine.
    int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

    // walk through items, starting at index 2
    for (int i = 2; i < arrayOfInts.length; i++) {
        int current = arrayOfInts[i];

        // do we have a new highest product of 3?
        // it's either the current highest,
        // or the current times the highest product of two
        // or the current times the lowest product of two
        highestProductOf3 = Math.max(Math.max(
            highestProductOf3,
            current * highestProductOf2),
            current * lowestProductOf2);

        // do we have a new highest product of two?
        highestProductOf2 = Math.max(Math.max(
            highestProductOf2,
            current * highest),
            current * lowest);

        // do we have a new lowest product of two?
        lowestProductOf2 = Math.min(Math.min(
            lowestProductOf2,
            current * highest),
            current * lowest);

        // do we have a new highest?
        highest = Math.max(highest, current);

        // do we have a new lowest?
        lowest = Math.min(lowest, current);
    }

    return highestProductOf3;
}

Complexity
O(n)O(n) time and O(1)O(1) additional space.
 * 
 */
