package interviewbit.chapter5_linkedlist;

import java.util.Stack;

import interviewbit.chapter5_linkedlist.LinkedList.Node;

public class Palindrome {
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.push(8, llist);
		llist.push(6, llist);
		llist.push(4, llist);
		llist.push(8, llist);
//		llist.push(1, llist);
//		llist.push(1, llist);
//		llist.push(2, llist);
//		llist.push(3, llist);
//		llist.push(4, llist);
//		llist.push(5, llist);
		
		llist.traverseList(llist);
		System.out.println(isPalindrome(llist));
	}
	
	public static boolean isPalindrome(LinkedList llist) {
		Node currentNode = llist.head;
		//only one node;
		if(currentNode.next == null) {
			return true;
		}
		//only two nodes
		if(currentNode.next !=null && currentNode.next.next ==null) {
			if (currentNode.data == currentNode.next.data) {
				return true;
			} else {
				return false;
			}
		}
		
		Node runnerNode = currentNode.next.next;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		while (runnerNode.next != null && runnerNode.next.next != null) {
			// Push current node element
			stack.push(currentNode.data);
			currentNode = currentNode.next;
			runnerNode = runnerNode.next.next;				
		}
		
		if(runnerNode.next == null) {
			//push this element
			stack.push(currentNode.data);		
			currentNode = currentNode.next.next;						
		} else {
			stack.push(currentNode.data);
			currentNode = currentNode.next;
			stack.push(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println("Printing stack here");
		System.out.println(stack);
		
		while(currentNode != null) {
			int top = stack.pop();
			// If values are different then not a palindrome
			if(top != currentNode.data) {
				return false;					
			}
			currentNode = currentNode.next;
		}
		return true;		
	}
}
