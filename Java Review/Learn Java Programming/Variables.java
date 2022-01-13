/**
 * Basics I - Variables and Data Types
 * Basics II - Operators, Boolean Conditions (Beginning line 61)
 * @author Anthony Narlock
 */

public class Variables {
	/*
	 * Main Method
	 * 
	 * The main method essentially the beginning of the Java program.
	 * This is the instance of where the code in all projects will begin.
	 * 
	 * It will always be written as the following header
	 */
	
	public static void main(String[] args) { //Header
		
		/*
		 * Variables are simply a storage location of a piece of data under a name.
		 * In Java, these can be of 2 Data Types.
		 * 		#1 Primitive Data Type: byte, char, short, int, long, float, or double
		 * 		#2 Non-Primitive Data Type (Classes): String, Arrays, User-Created Classes, etc.
		 * 
		 * #1 Primitive Data Types:
		 * 
		 * int (Integer) - Size: 4 bytes, stores numbers -2,147,483,648 to 2,147,483,647
		 * double (floating point number/fractional) - Size: 8 bytes
		 * boolean (a true/false condition) - Size: 1 byte
		 * char (Character) - Size: 2 bytes (A single character, or ASCII Value)
		 */
		
		//Initialzing primitive data types as variables
		//<data-type> <variable-name> = <value>
		int myExampleInt = 14;
		char myExampleChar = 'A';
		boolean myExampleBool = false;
		double myExampleDouble = 7.27; //wysi
		
		/*
		 * In Java, it's typically normal to give variable names in camelCase.
		 * That is, the first word in the name is all lowercase, and the remaining
		 * have capital letters at the beginning of each word
		 */
		
		/*
		 * #2 Non-Primitive Data Types
		 * 
		 * These in Java are classes, they are defined differently and
		 * have their own set of attributes. They are also initialized
		 * differently than normal primitve types (with the exception of String)
		 * 
		 * Initialing non-primitive (class) types
		 * <data-type> <variable-name> = new <data-type>(Constructor)
		 */
		
		String myExampleString = new String("Hello");
		//Of course, as mentioned, strings can be defined like primitives
		String myOtherString = "World";
		
		/*
		 * Operators, Boolean Conditions, System Print
		 * 
		 * System.out.print(<some string>); //Prints text to the console
		 * System.out.println(<some string>); //Prints text to the console with a new line afterwards
		 * 		Escape sequences: A sequence that represents an action and not the character
		 * 			\n : New line
		 * 			\t : tab
		 * 			\b : backspace
		 * 			\r : Carriage return
		 * 			\f : form
		 * 			\' : Insert single quote
		 * 			\" : Insert Double quote
		 * 			\\ : Insert backslash
		 * 		Console printing also works for primitive data types.
		 * 			You can concatenate multiple values in the same print statement with the + operator
		 * 				System.out.println("Hello " + "World"); will print Hello World
		 * 
		 * 
		 * The selection of operators is pretty large, here they are and what they do
		 * 
		 * Arithmetic Operators - These do math
		 * + : Addition : Adds together two values
		 * - : Subtraction : Subtracts one value from another
		 * * : Multiplication : Multiplies two values
		 * / : Division : Divides one value by another
		 * % : Modulus : Returns the division remainder
		 * ++ : Increment : Increases the value of a variable by 1
		 * -- : Decrement : Decreases the value of the variable by 1
		 * 
		 * Assignment Operators - These assign values to variables
		 * = : Direct assignment : Equals
		 * += : Equals Plus <Value> : x += 3 -> x = x + 3
		 * -= : Equals Minus <Value> : x -= 3 -> x = x - 3
		 * *= : Equals Times <Value> : x *= 3 -> x = x * 3
		 * /= : Equals Divided by <Value> : x /= 3 -> x = x / 3
		 * %= : Equals Mod <Value> : x %= 3 -> x = x % 3
		 * Bitwise assignment operators
		 * &=, |=, ^=, >>=, <<=
		 * 
		 * Comparision Operators - Conditions
		 * == : Equal to
		 * != : Not Equal to
		 * > : Greater Than
		 * < : Less Than
		 * >= : Greater than or equal to
		 * <= : Less than or equal to
		 * 
		 * Logical Operators
		 * && : Logical and
		 * || : Logical or
		 * ! : Logical Not
		 */
		
		/*
		 * Some Examples of using operators
		 */
		int sum = myExampleInt + 4;
		System.out.println("The sum of " + myExampleInt + " + 4 = " + sum);
		
		boolean equalToFourteen = (sum == 14);
		System.out.println(equalToFourteen);
		
		/*
		 * Boolean Conditions / Expressions are essentially logical true/false statements.
		 * 
		 * The one provided above : (sum == 14)
		 * asks the question: is sum (the variable) equal to 14?
		 * The answer, being, no, will make the value of equalToFourteen be false.
		 * 
		 * We can use if statements to check if something is true or false, and do something
		 * based off of that code.
		 * 
		 * If can work alone,
		 * with an else if, //If not the first, maybe with this condition
		 * and or with an else //If none of the conditions, do this
		 */
		
		//Consider just having if, it won't do anything if the condition isn't true
		if(equalToFourteen) {
			System.out.println("True!");
		}
		
		//Consider having an else condition afterwards. If the first condition isn't true,
		//then it will return the block of code that is in the else condition
		if(equalToFourteen) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
		
		//Consider having an else if condition (you can have as many of these as you want)
		//It will check all of the conditions and if one returns true, it will run that code
		if(equalToFourteen) {
			System.out.println("Is 14!");
		} else if(sum == 18) {
			System.out.println("It is 18!");
		} else {
			System.out.println("Actually, it is " + sum);
		}
		
		/*
		 * Another note: If you just have one line of code in the code block that follows
		 * one of these conditions, you do not need to surround it with the curly braces.
		 */
		
		if(equalToFourteen)
			System.out.println("True!");
		
		/*
		 * For comparing Strings, it is a little different than just == operator.
		 * In this case, we use a method called equals.
		 */
		String hello = new String("Hello");
		String world = "World";
		
		boolean isHelloEqualToWorld = (hello.equals(world));
		
		if(isHelloEqualToWorld)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
}
