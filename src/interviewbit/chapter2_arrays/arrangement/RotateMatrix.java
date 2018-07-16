package interviewbit.chapter2_arrays.arrangement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrix {
	public static void main(String args[]) {

	}
	
	public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<ArrayList<Integer>> outputarray = new ArrayList<ArrayList<Integer>>();
	    
	    for(int m=0; m<=a.size(); m++){
		    ArrayList<Integer> rows = new ArrayList<Integer>();
		    for(int n=a.size()-1;n>=0;n--){
			    rows.add(a.get(n).get(m));
		    }
		    outputarray.add(rows);
    	}
    	return outputarray;
 
	}
}




