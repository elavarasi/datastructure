package sortingalgorithm;

/*http://www.sanfoundry.com/java-program-implement-heap-sort/

 * Java Program to Implement Heap Sort
 */
import java.util.Arrays; 

//For N nodes N/2 +1 to N are leaves

/* Class HeapSort */
public class HeapSort 
{    
    private static int N;

    /* Sort Function */
    public static void sort(int arr[])
    {       
        heapify(arr);  
        System.out.println("**heapify done");
        System.out.println(Arrays.toString(arr));
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     

    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }

    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
    	System.out.println(Arrays.toString(arr));

        int left = 2*i ;
        int right = 2*i + 1;
        
        int max = i;
        
    	System.out.println("i: " + i + " " + arr[i]);
    	
    	
    	System.out.println("max: " + max + " " + arr[max]);
    	

    	
    	
        if (left <= N && arr[left] > arr[i]) {
        	System.out.println("left: " + left + " " + arr[left]);
            max = left;	
        }

        if (right <= N && arr[right] > arr[max])   
        {
        	System.out.println("right: " + right + " " + arr[right]);
            max = right;
        }
        
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    

    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    

    /* Main method */
    public static void main(String[] args) 
    {
        
        /* Make array of n elements */
        int arr[] = {9,6,5,0,8,2,1,3};
        
        System.out.println("\nElements before sorting ");        
        System.out.println(Arrays.toString(arr));
        
        /* Call method sort */
        sort(arr);
        
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        System.out.println(Arrays.toString(arr));
          
    }    
}