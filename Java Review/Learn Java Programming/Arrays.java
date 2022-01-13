/*
 * Author: Anthony Narlock
 * 
 * Arrays, Loops, and 2D Arrays
 * 
 * Description: This Java file describes a basic understanding of arrays inside of Java
 * 
 * An array is one of the most basic data structures inside of programming. It is a 
 * simple list in which has a length, and many things can be done with these lists called arrays
 */

public class Arrays {
	public static void main(String[] args) {
		//Ways to declare arrays in Java
		int array1[];
		array1 = new int[20]; //Assigns array1 to a length of 20
		
		int array2[] = new int[20]; //Assigns array2 to a length of 20, one line
		
		int array3[] = {3, 1, 4}; //Assigns array3 to length 3, with 3 already set elements
		
		//You can make different types of arrays.
		//The type of array is dependent on which primitive or Object you want an array of
		String strArr[] = new String[3]; //This is an array of String (which is an Object in Java) assigned to length of 3.
		
		//Assign a single element in array
		strArr[0] = "Hello";
		strArr[1] = " World";
		strArr[2] = "!";
		
		/*
		 * The for loop
		 * 
		 * for loops are a control statement for specifying iteration.
		 * It allows code to be executed repeatedly.
		 * 
		 * For example, if we wanted to keep printing "Hello World"
		 * 
		 */
		
		//We could do it like this to print it four times
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		//Or, we can use the for loop to do so more efficiently
		for(int i = 0; i < 4; i++) {
			System.out.println("Hello World");
		}
		
		/*
		 * the for loop uses a variable (usually an integer) to represent 
		 * an index value of the control statement.
		 * 
		 * the first part of the for loop, int i = 0;
		 * initializes the loop to begin at an index integer of 0.
		 * 
		 * the second part of the for loop, i < 4, indicates the 'final'
		 * condition that the index will reach (or rather, it's boundary)
		 * 
		 * the final part, i++, indicates how each iteration changes the index.
		 * i++, will make the first index (0) equal to 1. (making the second iteration i = 1)
		 * 
		 * Hence, with the for loop definition above, we can essentially say this
		 * 
		 * Beginning iteration: i = 0 : prints Hello world;
		 * i++ -> iteration #2: i = 1 : prints Hello world;
		 * i++ -> iteration #3: i = 2 : prints Hello world;
		 * i++ -> iteration #4: i = 3 : prints Hello world;
		 * i++, since i = 4, the condition 4 < 4 is false. Hence, this is the end of the loop.
		 */
		
		//You can use a for loop to iterate through Array
		//Note: Arrays have a length attribute, which returns an integer of the array's length
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
			if(i == strArr.length - 1) {
				System.out.print("\n");
			}
		}
		
		//For loops are useful because you can set entire arrays like this instead of manually
		for(int i = 0; i < array1.length; i++) {
			array1[i] = i;
			
			if(i != 19) {
				System.out.print(array1[i] + ", ");
			} else {
				System.out.print(array1[i]);
			}
			
			if(i == array1.length - 1) {
				System.out.print("\n");
			}
		}
		
		/*
		 * The while loop
		 * 
		 * One of the other common loops in programming is the while loop.
		 * Essentially, it takes in a boolean condition, similar to an if statement,
		 * and will repeat it's code block until the condition returns false
		 * 
		 * It is basically saying, while(true) { <do this code> }
		 * 
		 * At some point in the while loop, we want to make the condition false,
		 * which will eventually be the end of the iterations.
		 */
		
		int whileIndex = 5;
		while(whileIndex != -1) {
			System.out.println("whileIndex = " + whileIndex);
			whileIndex--; //The loop terminates from this line, when whileIndex will eventually equal -1
		}
		
		/*
		 * The do while loop
		 * 
		 * Essentially a while loop, just in a different form.
		 * A do while loop basically says
		 * do {<this code>} while {someBooleanCondition}
		 * 
		 * it will terminate when someBooleanCondition is false
		 */
		int doWhileIndex = 5;
		do {
			System.out.println("doWhileIndex = " + doWhileIndex);
			doWhileIndex--;
		} while (doWhileIndex != -1);
		
		
		/*
		 * While not a loop, it is still relevant to mention switch statement
		 * It will essentially execute code based off of the condition that is checked
		 */
		int day = 4;
		switch (day) {
			case 6:
				System.out.println("It is Saturday");
				break;
			case 7:
				System.out.println("It is Sunday");
				break;
			default:
				System.out.println("Looking forward to the weekend");
		}
		//Since day is 4, it will go to default case. You can change this on your own to test the others.
		
		/*
		 * 2D Arrays
		 * Two Dimensional Arrays
		 * 
		 * If we think of a regular array, we think of a list, or something similar, maybe a line.
		 * If we were to think of expanding that array, into an array of arrays, we would get something
		 * similar to a grid, maybe an xy-plane in math, or something similar.
		 * 
		 * In programming, we can represent such things as a 2D array.
		 */
		
		//Initialize 2D array
		int[][] grid = new int[3][3]; //Creates a 3 x 3 2D Array
		int[][] example2DArray = new int [2][4]; //Creates a 2 x 4 2D array - 2 rows, 4 columns
		
		//We can modify elements of the array prior to initialization:
		grid[0][0] = 1;
		grid[0][1] = 2;
		grid[0][2] = 3;
		grid[1][0] = 4;
		grid[1][1] = 5;
		grid[1][2] = 6;
		grid[2][0] = 7;
		grid[2][1] = 8;
		grid[2][2] = 9;
		
		//We could also initialize the 2D array with pre-determined values
		int[][] otherGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		/*
		 * Nested for loop
		 * 
		 * A nested for loop is an efficient way of printing values from a 2D array, or
		 * a set in which we have a similar index for each row/col
		 * 
		 * If we think of our outer for loop representing iterations between rows,
		 * and our inner for loop representing iterations of each row's column elements,
		 * we can iterate through a 2D array
		 */
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.println(grid[row][col]);
			}
		}
		
		//Similarly with our predefined otherGrid
		for(int row = 0; row < otherGrid.length; row++) { //outer stops at the end length of the row
			for(int col = 0; col < otherGrid[row].length; col++) { //inner stops when we reach the last column element in the row
				System.out.println(otherGrid[row][col]);
			}
		}
		
	}
}
