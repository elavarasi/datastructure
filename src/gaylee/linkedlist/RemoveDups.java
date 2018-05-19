package gaylee.linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Remove duplicates from an unsorted linked list
 * follow up: how would u solve the problem if temporary buffer is not allowed.
 
 *
 */

public class RemoveDups {
	public static void main(String args[]){
		
		LinkedList<Integer> input = new LinkedList<Integer>();
		input.add(5);
		input.add(3);
		input.add(5);
		input.add(2);
		input.add(5);
		input.add(1);
		
		input.remove();
		
		System.out.println(input);
		System.out.println(removeDups(input));
		
	}
	


	
	
	public static LinkedList<Integer> removeDups(LinkedList<Integer> input){
		HashSet<Integer> set = new HashSet<Integer>();
		
		Iterator<Integer> iterator = input.iterator();
		
		while(iterator.hasNext()){
			int data = iterator.next();
			if(set.contains(data)){
				iterator.remove();
			} else {
				set.add(data);
			}
			
		}
		System.out.println(input);
		return input;
		
		
		
	}

	
}




