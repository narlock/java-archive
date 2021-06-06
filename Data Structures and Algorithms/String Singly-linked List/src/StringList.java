 /**
 * Implementation of a list of strings using a singly-linked list.
 *
 * @author Mithat Konar
 * @author Anthony Narlock
 */
public class StringList {

    /* ------------------------------------------------------- *
     * Inner classes                                           *
     * ------------------------------------------------------- */
    /**
     * The node used by StringList.
     */
    private class StrNode {

        String data;
        StrNode next;
    }

    /* ------------------------------------------------------- *
     * Instance variables                                      *
     * ------------------------------------------------------- */
    private StrNode head;   // the head of the singly-linked list.

    /* ------------------------------------------------------- *
     * Instance methods                                        *
     * ------------------------------------------------------- */
    /**
     * No-argument constructor.
     */
    public StringList() {
        head = null;
    }

    /**
     * Adds an item to the start of the list.
     *
     * @param s the item to add
     */
    public void prepend(String s) {
        StrNode newNode = new StrNode();
        newNode.data = s;
        newNode.next = head;
        head = newNode;

    }

    /**
     * Adds an item to the end of the list.
     *
     * @param s the item to add
     */
    public void append(String s) {
        StrNode newNode = new StrNode();
        newNode.data = s;
        
        //Checks if the list was empty
        if(head == null) {
        	head = newNode;
        }
        
        //Append normally
        else {
        	StrNode curNode = head;
        	while(curNode.next != null) {
        		curNode = curNode.next;
        	}
        	curNode.next = newNode;
        }
    }

    /**
     * Inserts an item after the first instance of a key if the key exists.
     *
     * @param s the item to insert
     * @param key the item in the list to insert after
     * @return whether the insertion was successful
     */
    public boolean insertAfter(String s, String key) {
        StrNode curNode = new StrNode();
        curNode = head;
        
        while(curNode != null) {
        	if(curNode.data == key) {
        		StrNode newNode = new StrNode();
        		newNode.data = s;
        		newNode.next = curNode.next;
        		curNode.next = newNode;
        		return true;
        	}
        	curNode = curNode.next;
        }
        return false;
    }
    
    /**
     * Deletes the first instance of an item from the list.
     *
     * @param key the value of the item to delete from the list.
     * @return whether the deletion was successful.
     */
    public boolean delete(String key) {
        StrNode prevNode = head;
        StrNode curNode = head;
        
        while(curNode  != null) {
        	if(curNode.data == key && curNode == head) {
        		head = curNode.next;
        		return true;
        	}
        	
        	else if (curNode.data == key) {
        		prevNode.next = curNode.next;
        		
        		return true;
        	}
        	
        	if(curNode == head && prevNode == head) {
        		curNode = curNode.next;
        	} else {
        		prevNode = prevNode.next;
        		curNode = curNode.next;
        	}
        }
        return false;
    }

    /**
     * Returns the value of the nth item in the list.
     * 
     * @param n the zero-based index of the item to return
     * @return the value of the nth item
     */
    public String get(int n) {
        try {
        	StrNode curNode = head;
        	int current_number = 0;
        	
        	while(curNode != null) {
        		if(current_number == n)
        			return curNode.data;
        		current_number++;
        		curNode = curNode.next;
        	}
        } catch (IndexOutOfBoundsException e) {
        	System.err.print("An IndexOutOfBoundsException was caught, meaning that the specified number to get is invalid.");
        	return null;
        }
        // Note: if n is out of bounds, raise an IndexOutOfBoundsException.
    	return null;
    }

    /**
     * Returns the number of items in the list.
     *
     * @return the number of items in the list
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
     * Returns a string of all the items in the list separated by a space.
     *
     * The last item will have a space after it too.
     *
     * @return list of the list's values
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

