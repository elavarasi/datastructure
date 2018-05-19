package gaylee.linkedlist;

public class LinkedListNode {
	LinkedListNode next;
	LinkedListNode prev;
	LinkedListNode last;
	public int data;
	
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
		data = d;
		next = n;
		prev = p;
	}
	
	public LinkedListNode(){};
	
	public LinkedListNode(int d){
		data = d;
	}
	
	public void setNext(LinkedListNode n){
		next = n;
		if(this == last){
			last = n;
		}
		
		if(n!= null && n!= this){
			n.setPrevious(this);
		}
	}
	
	
	public void setPrevious(LinkedListNode p){
		prev = p;
		
		if(p!=null && p.next != this){
			p.setNext(this);
		}
		
		
	}
	
	
	
}
