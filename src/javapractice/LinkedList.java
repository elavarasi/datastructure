package javapractice;

public class LinkedList<E> {

	transient int size = 0;
	transient Node<E> first = null;
	transient Node<E> last = null;
	
	public LinkedList(){
		
	}
	
	
	//adds the specified element to the end of the list
	
	public boolean add(E e){
		Node<E>  l = last;
		Node<E> newNode = new Node<>(l,e,null);
		last = newNode;
		if(l==null){
			first = newNode;
		} else {
			l.next = newNode;
		}
		size ++;
		
		return true;	
	}




 private  static class Node<E> {
	 E item;
	 Node<E> next;
	 Node<E> previous;
 	
	Node(Node<E> prev, E element, Node<E> next){
		this.item = element;
		this.previous = prev;
		this.next = next;
		
	}
 }
 
 
 
}