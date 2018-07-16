package interviewbit.chapter5_linkedlist;

import interviewbit.chapter5_linkedlist.LinkedList.Node;

public class LinkedListImplementation {
	public static void main(String args[]) {
		//Create a new linked list
		LinkedList list1 = new LinkedList();
		
		//create head node and child nodes
		list1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		// Add the child nodes to the head node
		list1.head.next = second;
		second.next = third;
		
		// Traverse and print a linked list
		list1.traverseList(list1);
		
		// Add a node to the linked list at the beginning
		list1.push(7, list1);
		
		// Add a node to the end of the linked list
		list1.append(10, list1);
		
		// Traverse and print a linked list
		list1.traverseList(list1);
		
		// Delete a node for the first occurrence of a given key 
		list1.deleteNode(10, list1);
		
		// Traverse and print a linked list
		list1.traverseList(list1);
		
		// Count number of nodes
		list1.getCount(list1);
		
		System.out.println(list1.getCountRec(list1.head));
	}
}

class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;	
		
		public Node(int d) {
			data = d;
		}
	}
	
	public LinkedList push(int data, LinkedList llist) {
		Node newnode = new Node(data);
		if(llist.head == null) {
			llist.head = newnode;
			newnode.next = null;
		} else {
			newnode.next = head;
			head = newnode;
		}
		return llist;
	}
	
	// Append node to the end
	public LinkedList append(int data, LinkedList llist) {
		Node newnode = new Node(data);
		Node currentnode = llist.head;
		while(currentnode.next != null) {
			currentnode = currentnode.next;
		}
		currentnode.next = newnode;
		newnode.next = null;
		
		return llist;
	}
	
	public LinkedList deleteNode(int data, LinkedList list) {
		if (list == null) {
			return null;
		}
		
		// no nodes in the linked list - empty linked list
		if (list.head == null) {
			return list;
		}
		
		
		//Check if head has the data node
		Node currentNode = list.head;
		if(head.data == data) {
			list.head = list.head.next;
			currentNode.next = null;
			return list;
		} else {
			//Traverse through the body node to check if the expected data is present
			Node previousNode = currentNode;
			while(currentNode != null) {
				if(currentNode.data == data) {
					previousNode.next = currentNode.next;
					currentNode.next = null;	
					break;
				} else {
					previousNode = currentNode;
					currentNode = currentNode.next;
					
				}
			}
		}
		return list;		
	}
	
	public LinkedList insertNode(int data, LinkedList list) {
		return null;
		
	}
	
    /* Function deletes the entire linked list */
    public void deleteList(LinkedList list)
    {
        list.head = null;
    }
	
	// Linked list traversal and printing all node values
	public void traverseList(LinkedList list) {
		Node n = list.head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("****");
	}
	
	// Count linked list elements
	public int getCount(LinkedList list) {
		int count = 0;
		if (list == null || list.head == null) {
			return 0;
		}
		
		Node currentNode = list.head;
		while(currentNode != null) {
			count ++;
			currentNode = currentNode.next;
		};
		System.out.println(count);
		return count;				
	}	
	
	// Count linked list elements
	   /* Returns count of nodes in linked list */
    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;
 
        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
	
}





