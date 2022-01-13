
/**
 * Merge sort implementations.
 * 
 * @author Mithat Konar
 * @author Anthony Narlock
 */
public class MergeSort {

    /**
     * Sorts an array using the merge sort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void sort(int[] arr) {
        rsort(arr, 0, arr.length - 1);
    }

    /**
     * Implements recursive merge sort algorithm for an array.
     *
     * @param arr The array to be sorted.
     * @param i The start of the Array (leftStart)
     * @param k The end of the Array (rightEnd)
     */
    public static void rsort(int[] arr, int i, int k) {
        int j = 0; //j Will represent the midpoint value
        
        if (i < k) {
        	j = (i + k) / 2; //Sets j to the midpoint Value
        	
        	//Recursively sorts left and right partitions
        	rsort(arr, i, j);
        	rsort(arr, j+1, k);
        	
        	//Merge left and right partitions in sorted order
        	merge(arr, i, j, k);
        	
        	
        }
        
        // Question to ponder: what is the base case (i.e., breaking case) in this recursive method?
    }

    /**
     * Merges two adjacent sorted portions in an array into one sorted portion.
     *
     * @param arr The array to be merged)
     * @param i The leftStart index
     * @param j the middle index
     * @param k The rightEnd index
     */
    public static void merge(int[] arr, int i, int j, int k) {
        int mergedSize = k - i + 1; 				//Size of merged partitions
        int mergePos = 0; 							//Position to insert merged number
        int leftPos = 0; 							//Pos of elements in left partition
        int rightPos = 0; 							//Pos of elements in right partition
        int[] mergedNumbers = new int[mergedSize]; 	//Dynamically allocates temp array for merged numbers
        
        leftPos = i;		//Initialize left partition position
        rightPos = j + 1;	//Initialize right partition position
        
        // Add smallest element from left or right partition to merged numbers
        while (leftPos <= j && rightPos <= k) {
        	if(arr[leftPos] <= arr[rightPos]) {
        		mergedNumbers[mergePos] = arr[leftPos];
        		++leftPos;
        	}
        	else {
        		mergedNumbers[mergePos] = arr[rightPos];
        		++rightPos;
        	}
        	++mergePos;
        }	
        
        // If left partition is not empty, add remaining elements to merged numbers
        while (leftPos <= j) {
        	mergedNumbers[mergePos] = arr[leftPos];
        	++leftPos;
        	++mergePos;
        }
        
        // If right partition is not empty, add remaining elements to merged numbers
        while (rightPos <= k) {
        	mergedNumbers[mergePos] = arr[rightPos];
        	++rightPos;
        	++mergePos;
        }
        
        // Copy merge numbers back to numbers
        for(mergePos = 0; mergePos < mergedSize; ++mergePos) {
        	arr[i + mergePos] = mergedNumbers[mergePos];
        }
        
    }
}
