package interviewbit.chapter2_arrays.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 
 * 
 * 
 * 
 * A : [ 100, 100, 100, 100, 100 ]  should return 4
// */


//The below solution I providd is not efficient O(n2)
//public class MaxDistance {
//
//	
//	public static void main(String args[]){
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		
//		a.add(7);
//		a.add(4);
//		a.add(3);
//		a.add(5);
//		a.add(2);
//		a.add(7);
//		
//		int maxdistance = 0;
//		for(int i=0;i<a.size();i++){
//			
//			for(int j=1;j<a.size();j++){
//			 if((a.get(i) <= a.get(j)) && (maxdistance < j-i)){
//				 maxdistance = j -i;
//			 }
//			}
//		}
//		
//		
//		System.out.println(maxdistance);
//	}
//}
//


public class MaxDistance {
	// DO NOT MODIFY THE LIST
	public static void main(String args[]){
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	a.add(7);
	a.add(4);
	a.add(3);
	a.add(5);
	a.add(2);
	a.add(7);
	
	System.out.println(maximumGap(a));
	
	}
	
	
	
	public static int maximumGap(final List<Integer> A) {
	    int n = A.size();
	    int minLeft[] = new int[n];
	    int maxRight[] = new int[n];
	    
	    minLeft[0] = A.get(0);
	    for (int i = 1; i < n; i++) {
	        minLeft[i] = Math.min(minLeft[i - 1], A.get(i));
	    }
	    System.out.println(Arrays.toString(minLeft));
	    
	    maxRight[n - 1] = A.get(n - 1);
	    for (int i = n - 2; i >= 0; i--) {
	        maxRight[i] = Math.max(maxRight[i + 1], A.get(i));
	    }
	    System.out.println(Arrays.toString(maxRight));
	    
	    int j = n - 1;
        int max = -1;
        
	    for (j = n - 1; j >= 0; j--) {
	        int num = maxRight[j];
	        
		    int lo, hi, mid;
		    int index = -1;
		    
		    lo = 0;
		    hi = minLeft.length;
		    
		     
		    System.out.println("lo " + lo);
		    System.out.println("hi " + hi);
	        
		    while (lo <= hi) {
		        mid = lo + ((hi - lo) >> 1);
		        
		        int minNum = minLeft[mid];
		        
		        if (num < minNum) {
		            lo = mid + 1;
		        } else {
		            index = mid;
		            hi = mid - 1;
		        }
			    System.out.println("lo " + lo);
			    System.out.println("hi " + hi);
		        System.out.println("mid " + mid);
		        System.out.println("****");
		    }
	        
	        
	        max = Math.max(j - index, max);
	    }
	    
	    
	    return max;
	}
	
	
//	public static int minIndex(int [] minLeft, int num) {
//	    System.out.println("****");
//	    
//	   
//	    int lo, hi, mid;
//	    int index = -1;
//	    
//	    lo = 0;
//	    hi = minLeft.length;
//	    
//	     
//	    System.out.println("lo " + lo);
//	    System.out.println("hi " + hi);
//	    
//	    
//	    while (lo <= hi) {
//	        mid = lo + ((hi - lo) >> 1);
//	        
//	        int minNum = minLeft[mid];
//	        
//	        if (num < minNum) {
//	            lo = mid + 1;
//	        } else {
//	            index = mid;
//	            hi = mid - 1;
//	        }
//		    System.out.println("lo " + lo);
//		    System.out.println("hi " + hi);
//	        System.out.println("mid " + mid);
//	        System.out.println("****");
//	    }
//	    
//	    return index;
//	    
//	}
//	
	
}

	

