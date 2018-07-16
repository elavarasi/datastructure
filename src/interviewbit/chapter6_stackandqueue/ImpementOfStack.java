package interviewbit.chapter6_stackandqueue;

public class ImpementOfStack {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1, s);
		s.push(2, s);
		s.push(3, s);
		s.push(4, s);
		s.push(5, s);
		s.printStack(s);
	}
}

class Stack<T> {
	private StackNode<T> top = null;
	private int size = 0;
	private class StackNode<T> {
		private T value;
		private StackNode nextNode = null;
		
		StackNode(T data) {
			this.value = data;				
		}			
	}
	
	void push(T data, Stack s) {
		StackNode newNode = new StackNode(data);
		newNode.nextNode = top;	
		s.top = newNode;
		s.size ++;
	}
	
	private void pop(Stack s) {
		if(s.size == 0) {
			// throw new Exception("Empty stack");
		} else {
			s.top = top.nextNode;
			s.size --;
		}
	}
	
	private int getStackSize(Stack s) {
		return s.size;
	}
	
	public T peek(Stack s) {
		return (T) s.top.value;
	}
	
	void printStack(Stack s) {
		int stackSize = size;
		for(int i=0;i<stackSize;i++) {
			System.out.println(s.top.value);	
			s.pop(s);		
		}
	}
}
