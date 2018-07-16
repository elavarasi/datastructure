package interviewbit.chapter5_linkedlist;

import interviewbit.chapter5_linkedlist.LinkedList.Node;

public class ReorderList {
	public static void main(String args[]) {
		//A : [ 99 -> 9 -> 87 -> 56 -> 5 -> 88 -> 49 -> 53 -> 2 ->
		// 4 -> 47 -> 68 -> 32 -> 57 -> 25 -> 40 -> 93 -> 10 -> 51 -> 
		// 72 -> 1 -> 84 -> 66 -> 28 -> 38 -> 61 -> 23 -> 3 ]
		LinkedList llist = new LinkedList();
		llist.push(99, llist);
//		llist.push(9, llist);
//		llist.push(87, llist);
//		llist.push(56, llist);
//		llist.push(5, llist);
//		llist.push(88, llist);
//		llist.push(49, llist);
//		llist.push(53, llist);
//		llist.push(2, llist);
//		llist.push(4, llist);
//		llist.push(47, llist);
//		llist.push(68, llist);
//		llist.push(32, llist);
//		llist.push(57, llist);
//		llist.push(25, llist);
//		llist.push(40, llist);
//		llist.push(93, llist);
//		llist.push(10, llist);
//		llist.push(51, llist);
//		llist.push(72, llist);
//		llist.push(1, llist);
//		llist.push(84, llist);
//		llist.push(66, llist);
//		llist.push(28, llist);
//		llist.push(38, llist);
//		llist.push(61, llist);
//		llist.push(23, llist);
//		llist.push(3, llist);
		
		llist.traverseList(llist);
		System.out.println("****");
		System.out.println(reorderList(llist.head));
//		llist.traverseList(llist);
	}
	
    public static Node reorderList(Node head) {
    	if(head.next == null) {
    		return head;
    	}
    	
    	// Break into two linked list
    	Node p1 = head;
    	Node p2 = head;
    	Node previous = null;
    	while(p2!=null && p2.next!=null) {
    		previous = p1;
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}    	
    	previous.next = null;
    	p2 = p1;
    	p1 = head;    
    	
    	traverseList(p1);
    	traverseList(p2);
    	    	
		// Next reverse the second list
    	if (p2 !=null && p2.next!=null) {  //if there are more than one node then reverse the nodes
    		Node prev = null;
    		Node next = null;
    		Node current = p2;
    		while (current != null) {
    			next = current.next;
    			current.next = prev;
    			prev = current;
    			current = next;    			
    		}  
    		p2 = prev;    		
    	}    
    	traverseList(p2);
    	
    	// Put two list together:  
    	head = p1;
    	Node temp1 = null;
    	Node temp2 = null;

    	
    	while (p1!=null && p2 !=null) {
    		if(p1.next == null && p2.next !=null) {
    			p1.next = p2;
    			break;
    		}
    		temp1 = p1.next;
    		p1.next = p2;
    		temp2 = p2.next;
    		p2.next = temp1;

    		p1 = temp1;
    		p2 = temp2;   		
     	}
    	    	
    	System.out.println("***starting result");
    	traverseList(head);      
    	return head;      
    }
    
    
    
	public static void traverseList(Node p1) {
		while(p1 != null) {
			System.out.println(p1.data);
			p1 = p1.next;
		}
		System.out.println("****");
	}

    
}
