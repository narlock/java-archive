
/**
 * Quicksort implementations.
 *
 * @author Mithat Konar
 * @author Anthony Narlock
 */
public class Quicksort {

    /**
     * Sorts an array using the quicksort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void sort(int[] arr) {
        rsort(arr, 0, arr.length - 1);
    }

    /**
     * Implements recursive quicksort algorithm for an array.
     *
     * @param arr the array to be sorted.
     * @param i start index of the arr portion to be sorted
     * @param k end index of the arr portion to be sorted
     */
    public static void rsort(int[] arr, int i, int k) {
        int j = 0; //pivot
        
        //Base case: If there are 1 or zero elements to sort, partition is already sorted
        if (i >= k) {
        	return;
        }
        
        //Partition the data within the array. Value j returned
        //from partitioning is location of last element in low partition.
        j = partition(arr, i, k);
        
        //Recursively sort low partition (i to j) and high partition (j + 1 to k)
        rsort(arr, i, j);
        rsort(arr, j+1, k);
        
    }

    /**
     * Returns a partition index for the quicksort algorithm.
     *
     * @param arr the array to be partitioned
     * @param i start index of the arr portion to partition
     * @param k end index of the arr portion to partition
     * @return the partition index
     */
    public static int partition(int[] arr, int i, int k) {
        int l = 0;
        int h = 0;
        int midpoint = 0;
        int pivot = 0;
        int temp = 0;
        boolean done = false;
        
        // Pick middle element as pivot
        midpoint = i + (k - i) / 2;
        pivot = arr[midpoint];
        
        l = i;
        h = k;
        
        while (!done) {
        	
        	//Increment l while numbers[l] < pivot
        	while (arr[l] < pivot) {
        		++l;
        	}
        	
        	//Decrement h while numbers[i] > pivot
        	while(arr[h] > pivot) {
        		--h;
        	}
        	
        	// If there are zero or one elements remaining,
        	// all numbers are partitioned, Return h
        	if (l >= h) {
        		done = true;
        	}
        	else {
        		//Swap numbers[l] with numbers[h],
        		//update l and h
        		temp = arr[l];
        		arr[l] = arr[h];
        		arr[h] = temp;
        		
        		++l;
        		--h;
        	}
        }
        
        return h;
    }
}
