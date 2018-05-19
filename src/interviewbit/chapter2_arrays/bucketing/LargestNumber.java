package interviewbit.chapter2_arrays.bucketing;
/*
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 */



//not completed yet
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {
	
	public static void main(String args[]){
		LargestNumber obj1 = new LargestNumber();
		List<Integer> A = new ArrayList<Integer>();
		A.add(472);
		A.add(9);
		A.add(986);
		A.add(91);
		A.add(9);
		A.add(552);
		A.add(3);
		
		System.out.println(obj1.largestNumber(A));
		
	}
	
	
	
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> A) {
	    StringBuffer strBuf = new StringBuffer();
	    Node num[];
	    int i = 0;
	    
	    num = new Node[A.size()];
	    
	    for (int n : A) {
	        num[i] = new Node(n);
	        i++;
	    }
	    
	    System.out.println(num.toString());
	    Arrays.sort(num);
	    System.out.println(num);
	    
	    for (Node n : num) {
	        if (n.number == 0 && strBuf.length() != 0)
	            continue;
	        strBuf.append(n.number);
	    }

	    
	    return strBuf.toString();
	}
	
	class Node implements Comparable<Node> {
	    
	    int number;
	    
	    public Node(int number) {
	        this.number = number;
	    }
	    
	    @Override
	    public int compareTo(Node o) {
	    	System.out.println("inside comparision");
	    	
	        String first = String.valueOf(this.number) + String.valueOf(o.number);
	        String second = String.valueOf(o.number) + String.valueOf(this.number);
	        System.out.println(o.number);
	        System.out.println(this.number);
	        
	        System.out.println("*****");
	        
	        return second.compareTo(first);
	    }
	    
	}
}
