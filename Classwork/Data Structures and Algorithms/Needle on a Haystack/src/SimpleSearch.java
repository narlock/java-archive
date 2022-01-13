import java.util.ArrayList;

/**
 *
 * @author TODO: Anthony Narlock
 */
public class SimpleSearch {

    // TODO: Write public static method called search that takes as 
    //       parameters an ArrayList of Strings and a String. The
    //       method should search the ArrayList of Strings for the 
    //       String and return the index of the search string in 
    //       the ArrayList or -1 if it's not found.
	
	public static int search(ArrayList<String> strlist, String str) {
		
		for(int i = 0; i < strlist.size(); i++) {
			if(strlist.get(i).equals(str)) {
				return i;
			}
		}
		
		return -1;
	}
    
}
