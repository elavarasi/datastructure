package interviewbit.chapter2_arrays.mergeInterval;


//Ela solution works but it says taking more time
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
 * Merge Overlapping IntervalsBookmark Suggest Edit
Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
 */


public class MergeOverlappingInterval {

	public static void main(String args[]){
		ArrayList<Interval> input = new ArrayList<Interval>();

		input.add(new Interval(2,9));
		input.add(new Interval(3,8));
		input.add(new Interval(4,7));
		input.add(new Interval(5,6));
		input.add(new Interval(6,6));
		input.add(new Interval(1,10));
		
		
		Comparator<Interval> comparator = new Comparator<Interval>() {
		    @Override
		    public int compare(Interval left, Interval right) {
		        return left.start - right.start; // use your logic
		    }
		};

		Collections.sort(input, comparator);
		
		
		System.out.println("input is" + input);
		ArrayList<Interval> output = mergeOverlappingInterval(input);
		
		System.out.println("output is" + output);
	
	}
	
	
	static ArrayList<Interval> mergeOverlappingInterval(ArrayList<Interval> input){
		int i=0, j = 1;
		
		System.out.println(input.size());
		
		while (j<input.size()){
			System.out.println("****");
			System.out.println(input.get(i).toString());
			System.out.println(input.get(j).toString());

			if(j == input.size()-1){
				break;
			}
			
			while(input.get(j).start > input.get(i).end && j < input.size()-1){
				i++;
				j++;
				
			}
			while(input.get(j).start < input.get(i).end && input.get(j).start > input.get(i).start && j < input.size()){
				int end = Math.max(input.get(i).end, input.get(j).end);
				input.get(i).end = end;
				input.remove(j);
				if(input.size()==1){
					break;
				}
				System.out.println("after remove size" + input.size());
				System.out.println(input.get(i).toString());
			
			}
			
		}
		
		return input;
		
	}
	
}


class Interval {
	int start;
	int end;
	
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	Interval(){
		this.start = 0;
		this.end = 0;
	}
	
	public String toString(){
		return "start: " + start + " end: " + end;
		
	}
}





/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new IntervalComp());
        ArrayList<Interval> res;
        Interval inter;
        int n = intervals.size();
        res = new ArrayList<>();
        
        for (int i = 0; i < n;) {
            
            inter = new Interval(intervals.get(i).start, intervals.get(i).end);
            Interval next;
            i++;
            
            while (i < n) {
                next = intervals.get(i);
                if (overlap(inter, next)) {
                    inter.end = Math.max(inter.end, next.end);
                    i++;
                } else {
                    break;
                }
            }
            
            res.add(inter);
            
        }
        
        return res;
    }
    
    private boolean overlap(Interval int1, Interval int2) {
        
        if (int1.end >= int2.start && int1.start <= int2.end)
            return true;
            
        return false;
        
    }
    
    private class IntervalComp implements Comparator<Interval> {
        
        @Override
        public int compare(Interval interval1, Interval interval2) {
            int cmp =  Integer.compare(interval1.start, interval2.start);
            if (cmp != 0)
                return cmp;
            cmp = Integer.compare(interval1.end, interval2.end);
            return cmp;
        }
        
    }
    
}
 * }
 */