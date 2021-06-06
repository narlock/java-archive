/**
 * Implementation of a stack of strings using a linked structure.
 *
 * @author Mithat Konar
 * @author Anthony Narlock
 */
public class StringStack {

    /* ------------------------------------------------------- *
     * Inner classes                                           *
     * ------------------------------------------------------- */
    /**
     * The node used by StringStack.
     */
    private class StrNode {

        String data;
        StrNode next;
    }
    
    /* ------------------------------------------------------- *
     * Instance variables                                      *
     * ------------------------------------------------------- */
    private StrNode head;   // the head of the stack.

    /* ------------------------------------------------------- *
     * Instance methods                                        *
     * ------------------------------------------------------- */
    /**
     * No-argument constructor.
     */
    public StringStack() {
        head = null;
    }

    /**
     * Push an item onto the stack.
     *
     * @param s the item to add
     */
    public void push(String s) {
    	StrNode newNode = new StrNode();
        newNode.data = s;
        newNode.next = head;
        head = newNode;
    }

    /**
     * Returns the value of the item at the top of the stack.
     *
     * @return the value of the item at the top of the stack
     */
    public String peek() {
        // Note: if the list is empty, raise an IndexOutOfBoundsException.
        	if(!isEmpty()) {
        		return head.data;
        	}
        	else {
        		throw new IndexOutOfBoundsException("Index out of bounds");
        	}
        
    }

    
    /**
     * Returns the value of the item at the top of the stack and removes the item.
     *
     * @return the value of the item at the top of the stack
     */
    public String pop() {
        // Note: if the list is empty, raise an IndexOutOfBoundsException.
        
        	if(head == null) {
        		throw new IndexOutOfBoundsException("Index out of bounds");
        	}
    		
    		String poppedItem = head.data;
        	head = head.next;
        	return poppedItem;
        } 
    
    /**
     * Returns the number of items in the stack.
     *
     * @return the number of items in the stack
     */
    public int length() {
    	StrNode curNode = head;
        int length_count = 0;
        
        while(curNode != null) {
        	length_count++;
        	curNode = curNode.next;
        }
        
    	return length_count;
    }

    /**
     * Returns whether or not the stack is empty.
     *
     * @return true if and only if the stack is empty
     */
    public boolean isEmpty() {
        if(head == null) {
        	return true;
        } else {
        	return false;
        }
    }
    
    /**
     * Returns a string of all the items in the stack separated by a space.
     *
     * The last item will have a space after it too.
     *
     * @return stack of the stack's values
     */
    @Override
    public String toString() {
    	String listContents = "";
    	
    	StrNode curNode = head;
        while(curNode != null) {
        	listContents += curNode.data + " ";
        	curNode = curNode.next;
        }
    	
    	return listContents;
    }
}
