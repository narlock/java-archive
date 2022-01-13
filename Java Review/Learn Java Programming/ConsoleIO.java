/*
 *  Author: Anthony Narlock
 *  
 *  Description: This class describes basic input and output inside of Java
 *  In this simple example, we will take the user's name, and then add two numbers together of their choice
 */

//Scanner is the most common way of receiving input from the user in Java, import statement is below
import java.util.Scanner;

public class ConsoleIO {
	public static void main(String[] args) {
		
		System.out.print("System.out.print will print text on the same line");
		System.out.println("System.out.println will output text and then create a new line (\\n");
		
		//Suppose I have an integer, called num, we can assign this to anything
		int num = 100;
		System.out.printf("This is an example of printf, or print formatted. The number is %d. \n", num);
		// %d represents digit, or integer, %f represents float, %s represents strings
		String str = "Hello World!";
		System.out.printf("%s\n", str);
		
		//Now we will take User input using scanner
		Scanner input = new Scanner(System.in); //This is how to create a proper Scanner object
		
		//Getting input for integers
		System.out.print("Enter an integer: ");
		num = input.nextInt(); //Takes input of integer
		System.out.println("The integer you entered was " + num);
		
		System.out.print("Enter a second integer: ");
		int num2 = input.nextInt();
		System.out.println("The sum of both integers is " + (num + num2));
		
		//Getting input for float
		System.out.print("Enter float value: ");
		float floatNum = input.nextFloat();
		System.out.println("The float that was inputted was " + floatNum);
		
		//Getting input for double
		System.out.print("Enter double value: ");
		double doubleNum = input.nextDouble();
		System.out.println("The double that was inputted was " + doubleNum);
		
		//Getting input for a String
		System.out.print("Enter a string: ");
		String myStr = input.next();
		System.out.println("The string you entered read: " + myStr);
		
		//The scanner has a buffer after using next, as, it keeps the \n (from my knowledge), thus in order to rid that, a nextLine is needed
		input.nextLine();
		
		//If you wanted to get input for an entire "sentence" - like String
		System.out.print("Enter a sentence: ");
		String mySentence = input.nextLine();
		System.out.println("The sentence read: " + mySentence);
		
		//Close the input buffer
		input.close();
		
	}
}
