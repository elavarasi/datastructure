package interviewbit.timecomplexity;

public class BigO {
	
	public static void main(String args[]){
		int n = 10;
		int i,j;
		long k = 0;
		for (i = n/2; i<=n; i++){
			for(j=2; j <= n; j=j*2){
				System.out.println("i " + i);
				System.out.println("j " + j);
				System.out.println("n " + n);
				System.out.println("********");
				k = (k + n)/2l;
			}
			
		}
		
	}

}
