package javapractice;

import java.util.HashMap;

public class Fibonacci {

	public static void main(String args[]){
		
		int n = 8;
	
		System.out.println(fib.calculatefib(n));
		
			
	}
}
	
	
	class fib{
		static HashMap<Integer, Integer> memo = new HashMap<>();
		
		static  int calculatefib(int n){
			
			if(n < 0){
				throw new IllegalArgumentException(
		                "Index was negative. No such thing as a negative index in a series.");
			} else if (n==0 || n==1){
				return n;
			}
			
			
			if(memo.containsKey(n)){
				System.out.println("grabbing  for" + n);
				return memo.get(n);
			}
			
			System.out.println("calculating febo for" + n);
			
			int febo = calculatefib(n-1) + calculatefib(n-2);
			
			memo.put(n, febo);
			System.out.println(memo);
			
			
			return febo;
			
			
		}
	}

