
/**
 * Implementation of a queue of strings using an array.
 *
 * @author Mithat Konar
 * @author Anthony Narlock
 */
public class StringQueue {

    /* ------------------------------------------------------- *
     * Instance variables                                      *
     * ------------------------------------------------------- */
    private String[] queue;         // the actual queue or items.
    private int numItems;           // the current number of items in the queue
    private final int MAX_ITEMS;    // the maximum number of items this queue can hold

    /* ------------------------------------------------------- *
     * Instance methods                                        *
     * ------------------------------------------------------- */

    /**
     * No-argument constructor.
     *
     * Initialize the queue to have a maximum of 128 items.
     *
     */
    public StringQueue() {
        numItems = 0;
        MAX_ITEMS = 128;
        queue = new String[MAX_ITEMS];
    }

    /**
     * Parameterized constructor.
     * 
     * Initialize the queue to have a user-set maximum number of items.
     *
     * @param maxItems the maxumum number of items this queue can hold
     */
    public StringQueue(int maxItems) {
        numItems = 0;
        MAX_ITEMS = maxItems;
        queue = new String[MAX_ITEMS];
    }

    /**
     * Push an item onto the queue.
     *
     * If there is no more room is the queue, throws IndexOutOfBoundsException.
     *
     * @param s the item to add
     */
    public void push(String s) {
    	if(numItems + 1 == MAX_ITEMS + 1) {
    		throw new IndexOutOfBoundsException("There is no more room!");
    	}
    	
    	//add to end of the array
    	queue[numItems] = s;
    	numItems++;
    }

    /**
     * Returns the value of the item at the front of the queue.
     *
     * @return the value of the item at the front of the queue
     */
    public String peek() {
        // Note: if the list is empty, raise an IndexOutOfBoundsException.
        if(numItems == 0) {
        	throw new IndexOutOfBoundsException("The array is empty");
        }

        //return value of item at front
        return queue[0];
    }

    /**
     * Pop the queue.
     *
     * Returns the value of the item at the end of the queue and removes it.
     *
     * @return the value of the item at the top of the queue
     */
    public String pop() {
        // Note: if the list is empty, raise an IndexOutOfBoundsException.
    	
        // return value of the item at the end and remove it
    	if(numItems == 0) {
            throw new IndexOutOfBoundsException("The array is empty");
        }
    		
    	String first_value = queue[0];
    	
    	for(int i = 0; i < numItems; i++) {
    		if(i != 0) {
    			queue[i-1] = queue[i];
    		}
    	}
    	
    	numItems--;
    	
    	return first_value;

        
    }

    /**
     * Returns the number of items in the queue.
     *
     * @return the number of items in the queue
     */
    public int length() {
        return numItems;
    }

    /**
     * Returns whether or not the queue is empty.
     *
     * @return true if and only if the queue is empty
     */
    public boolean isEmpty() {
    	if(numItems == 0) {
    		return true;
    	}
    	else return false; // Bogus values
    }
    
    public String returnNull() {
    	return null;
    }

    /**
     * Returns a string of all the items in the queue separated by a space.
     *
     * The last item will have a space after it too. If the list is empty,
     * return an empty string.
     *
     * @return string of the queue's values
     */
    @Override
    public String toString() {
        
        String queueInfo = "";
        
        for (int i = 0; i < numItems; i++) {
        	queueInfo += queue[i] + " ";
        }
        
        return queueInfo; // Bogus value
    }
}
