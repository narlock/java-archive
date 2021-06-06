
import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
    // TODO: Write the bubble sort algorithm to sort the ArrayList of userIDs.
    public static void bubblesort(ArrayList<String> userIDs) {
     for(int j = userIDs.size() - 1; j > 1; j--)  
    	for(int i = userIDs.size() - 1; i > 0; i--) {
    		if(userIDs.get(i).compareTo(userIDs.get(i-1)) < 0)  { 
    			String temp = userIDs.get(i-1);
    			userIDs.set(i-1, userIDs.get(i));
    			userIDs.set(i, temp);
    		}
    	}
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        ArrayList<String> userIDList = new ArrayList<>();
        String userID;

        // Construct list of userIDs
        userID = stdin.next();
        while (!userID.equals("-1")) {
            userIDList.add(userID);
            userID = stdin.next();
        }

        // Sort the list 
        bubblesort(userIDList);

        // Output results
        for (int i = 0; i < userIDList.size(); i++) {
            System.out.println(userIDList.get(i));
        }
    }
}
