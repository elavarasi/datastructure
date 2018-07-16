/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


A:          a1  a2
                   
                     c1 c2  c3
                   
B:     b1  b2  b3

begin to intersect at node c1.

 Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
package interviewbit.chapter5_linkedlist;

public class IntersectionOfLinkedLists {
	public static void main(String args[]) {
		ListNode a = new ListNode(10);
		
	}
	
	
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
		return b;
    }
    
    public void push(int data) {
    	
    }
    
    public void printList(ListNode a) {
    	
    }

}

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { 
    	val = x; 
    	next = null; 
    }
 }


