import java.util.ArrayList;

/**
 * Lambda Expressions
 * @author Anthony
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

public class LambdaExpressions {

	public static void main(String[] args) {
		//Consider arraylist
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//Adding numbers to the arraylist
		nums.add(5);
		nums.add(6);
		
		//We can print out each element using a lambda expression
		nums.forEach( (n) -> {
			System.out.println(n);
		});
	}
}
