import java.util.ArrayList;

/**
 * Recursion and Lambda Expressions
 * @author Anthony Narlock
 */

public class Recursion {

	public static void main(String[] args) {
		/*
		 * Recursion is a functional programming technique in which a function (or method) will call itself
		 * repeatedly until a base case is reached.
		 * 
		 * Consider our definition of fib, which is below the main method.
		 * This function is a very simply example of how recursion works.
		 * 
		 * fib first defines the base cases, (if num < 2), return 1.
		 * Meaning that for any number that is < 2, it will return a distinct value of 1.
		 * However, we have our recursive case, which is defined as fib(num-2) + fib(num-1)
		 * 		These are recursive calls to the same function, since they are essentially
		 * 		recalling the function. It is intuition to notice that upon each recursive call
		 * 		the input size decreases, and we are essentially a calling a smaller version
		 * 		of a similar problem.
		 * 
		 * I won't explain much more about recursion, just how it is implemented in Java.
		 * See definition of fib
		 */
		
		System.out.println(fib(4));
		/*
		 * fib(4) = fib(3) + fib(2)
		 * 			fib(3) = fib(2) + fib(1)
		 * 					fib(2) = fib(1) + fib(0)
		 * 					
		 * 					fib(1) = 1 //Base case
		 * 					fib(0) = 0 //Base case
		 */
		
		/*
		 * Lambda Expressions
		 * 
		 * Demonstrates lambda expressions in Java with simple example
		 * 
		 * Inline values:
		 * String name = "Anthony";
		 * double pi = 3.1415;
		 * 
		 * Consider function as value:
		 * public void perform() {
		 * 		System.out.println("Hello World");
		 * }
		 * 
		 * You can in a way assign this to a value by using lambda expression
		 * 
		 */
		
		//Consider arraylist (Refer to information about arraylist if you do not know what this is)
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//Adding numbers to the arraylist
		nums.add(5);
		nums.add(6);
		
		//We can print out each element using a lambda expression
		nums.forEach( (n) -> {
			System.out.println(n);
		});
	}
	
	/*
	 * Fib
	 * 
	 * Returns the fibonacci number associated with it's call
	 * fib(0) = 1
	 * fib(1) = 1
	 * fib(2) = 2
	 * fib(3) = 3
	 * fib(4) = 5
	 * etc.
	 */
	public static int fib(int num) {
		if(num < 2)
			return 1;
		else return fib(num-2) + fib(num-1);
	}
}
