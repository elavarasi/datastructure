package interviewbit.chapter2_arrays.arrayMath;

import java.util.ArrayList;

/*
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).

This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.
 * 
 * 
 * trivial case:
 * A : [ -7, -13 ]
   B : [ 1, -5 ]
 * 
 * This should give 6 and not -6
 */

public class MinStepsInInfiniteGrid {
	public static void main (String args[]){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(-7);
		x.add(-13);
		

		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(1);
		y.add(-5);
		
		
		int numSteps = 0;
		for(int i=1;i<x.size();i++){
			
			System.out.println(x.get(i)-x.get(i-1));
			System.out.println(y.get(i)-y.get(i-1));
			numSteps += Math.max(Math.abs(x.get(i)-x.get(i-1)), Math.abs(y.get(i)-y.get(i-1)));
			System.out.println(numSteps);
			System.out.println("******");
		}
		
		
	}
	
	
}




/*
public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) ); 
        }
        return numSteps;
    }
}

*/