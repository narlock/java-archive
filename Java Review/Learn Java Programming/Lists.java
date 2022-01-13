import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * Linked List, ArrayList, HashMap
 * @author Anthony Narlock
 * 
 * The following are each data structures that contain different
 * ways of storing information in Java.
 * 
 * LinkedLists can be used to implement queues, stacks, or
 * other abstract data types
 * 
 * An ArrayList, is similar to an Array, it's different than
 * an array because it size can increase dynamically, while
 * a normal array's size is static and cannot be changed.
 * (unless initialized)
 * 
 * A HashMap, is essentially a dictionary. A match of
 * key value pairs. By looking for a key, it will return it's value.
 * These are useful for constant lookup time.
 */
public class Lists {
	public static void main(String[] args) {
		//Linked List
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
															  //(1,2); would put values 1 and 2 in the Linked List on initialization
		//Adding elements to Integer Linked List
		linkedList.add(4);
		linkedList.add(5);
		
		//Iterating over LinkedList
		for(int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		/*
		 * LinkedLists also have operations like
		 * 
		 * remove(i) - removes the indicated index
		 * pop, push, peek - abstract data type functions
		 * set(i, value) - sets the specified index to a value
		 */
		
		//ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//For initializing values, we can do it like this
		
		@SuppressWarnings("serial")
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>() {
			{	add(4);
				add(15);
			}
		};
		
		//or
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>(Arrays.asList(1,2,3,5,8,13,21)); //This requires util.Arrays import
		
		/*
		 * ArrayList operations are similar to linkedList operations
		 * add(e), add(i, e)
		 * clear()
		 * isEmpty()
		 * contains(Object)
		 * remove(i)
		 * set(i, e)
		 */
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		//Let's consider I wanted to store information on whether something was a fruit or vegetable.
		//It's a silly example, but just to show what a dictionary could do
		
		//Adding a key value pair to HashMap
		hashMap.put("apple", "fruit");
		hashMap.put("orange", "fruit");
		hashMap.put("cabbage", "vegetable");
		hashMap.put("broccoli", "vegetable");
		
		//Let's check whether cabbage is a fruit or a vegetable
		System.out.println("cabbage is a " + hashMap.get("cabbage")); //Constant lookup time.
		
		/*
		 * Other HashMap operations
		 * clear()
		 * isEmpty()
		 * remove(key)
		 * replace(key, value)
		 * size()
		 */
	}
}
