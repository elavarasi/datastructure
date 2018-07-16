package interviewbit.chapter5_linkedlist;

import interviewbit.chapter5_linkedlist.LinkedList.Node;

public class DetectCycles {
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(50);
		llist.head.next = new Node(20);
		llist.head.next.next = new Node(15);
		llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(10);
        
        // Creating a loop for testing 
        llist.head.next.next.next.next.next = llist.head.next.next;
		
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
		
//		llist.head.next.next.next = llist.head;
		
//		llist.traverseList(llist);
		System.out.println(detectCycle(llist.head).data);
	}
	
    public static Node detectCycle(Node head) {
    	Node slow = head;
    	Node fast = head;
    	
    	while (fast !=null && fast.next !=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		
    		if(slow==fast) {
    			break;
    		}
    	}
    	
    	
    //error check no meeting point:
    	if(fast == null || fast.next ==null) {
    		return null;
    	}
    	
    	
    	slow = head;
    	
    	while(slow != fast) {
    		slow = slow.next;
    		fast = fast.next;
    	}
    	    
		return fast;
    }

}



