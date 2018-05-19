package interviewbit.chapter3_math;
/**
 * 
Following code tries to figure out if a number is prime ( Wiki )
However, it has a bug in it.
Please correct the bug and then submit the code.
 *
 */




public class MathBug01 {
	public static void main(String args[]){
		int input = 4;
		boolean isPrime = true;
		
		
	    if(input == 1){
	        isPrime = false;
	    }
		
		int inputlimit = (int) Math.sqrt(input);
		System.out.println(inputlimit);
		
		System.out.println(Math.sqrt(input));
		
		
		System.out.println(Math.sqrt(inputlimit));
		
		for(int i=2;i <= inputlimit;i++){
			int reminder = input  % i;
			if(reminder == 0){
				
				System.out.println("the reminder is" + reminder);
				System.out.println(i);
				isPrime = false;
				break;
			}
		}
		
		System.out.println("the input " + input + " is " + isPrime);
		
		
	}
	
}
