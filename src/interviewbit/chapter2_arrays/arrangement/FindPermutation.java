package interviewbit.chapter2_arrays.arrangement;
//Ela got the answer right
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
Given a positive integer n and a string s consisting only of letters D or I, you have to find any permutation of first n positive integer that satisfy the given input string.

D means the next number is smaller, while I means the next number is greater.

Notes
- Length of given string s will always equal to n - 1
- Your solution should run in linear time and space.

Example :

Input 1:

n = 3

s = ID

Return: [2, 3, 1]

 *
Access Hint:*****
 * When the input string contains only D or I we just need to return all positive number upto n either in descending or ascending orders respectively.
So if n = 3, s = “II”, return [1, 2, 3]

Now, starting with each character of the input string, we need to substitute an appropriate number(from 1 to n) corresponding to each character(I or D).

So, Suppose we started with a set corresponding to all the elements from that we need to make permutation(i.e all integer from 1 to n).

As I denotes the next number should be larger, we need to substitute smallest remaining number from our set corresponding to subsequent I as it automatically makes the next element to be larger.

Similar things will happens with character D, we need to substitute the largest remaining number from our set.

As the input string size is n - 1, we to append the last integer to our answer

Input:

n :  5

s = DIDD

Return: [5, 1, 4, 3, 2]
 *
 */



public class FindPermutation {
	public static void main(String args[]){
		String s = "DDID";
		int b = 5;		
		findPermutation(s,b);	
	}
	
	public static ArrayList<Integer> findPermutation(String A, int B){
		
		SortedSet<Integer> set = new TreeSet<Integer>();
		for(int i=1;i<=B;i++){
			set.add(i);
		}
		
		System.out.println(set);
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int i=0;i<A.length();i++){
			if(A.charAt(i) == 'D'){
				output.add(set.last());
				set.remove(set.last());
			} else if (A.charAt(i) == 'I') {
				output.add(set.first());
				set.remove(set.first());
			}
			
		}
		output.add(set.first());
		System.out.println(output);
		return output;
	}
}
