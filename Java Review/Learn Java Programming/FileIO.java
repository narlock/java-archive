import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * FileIO and Exception Handling
 * @author Anthony Narlock
 * 
 */

public class FileIO {
	public static void main(String[] args) {
		/*
		 * To begin, exceptions are events that occur during the execution of a program.
		 * Exceptions disrupt the normal flow of a program's instruction.
		 * In order to prevent failure of project, we can handle these exceptions and move forward.
		 * 
		 * For example, if we were making a calculator program, we know that it is impossible
		 * to divide a number by zero.
		 * So, if a user did 20 / 0, Java would raise a ArithmeticExpression exception (/ by zero)
		 * and normally, this would cause the program to crash completely.
		 * Instead, what we can do is catch the exception. We can do this by attempting to run the
		 * code (trying to run the code), and if we raise an exception, we can handle it by
		 * doing something similar.
		 */
		
		//Consider 20/0
		try {
			System.out.println(20/0);
		} catch (ArithmeticException e) {
			System.out.println("Uh oh, [" + e + "] was found!");
			//and we could essentially continue our code...Instead of the program crashing
		}
		
		/*
		 * Other different exceptions include:
		 * 
		 * Unchecked Exceptions:
		 * --
		 * IndexOutOfBounds - (A string or array index is out of the bounds of object)
		 * NullPointerException - (Calling something that doesn't exist - probably not instantiated)
		 * 
		 * Checked Exceptions:
		 * --
		 * IOException
		 * SQLException
		 * FileNotFoundException
		 * 
		 * Suppose if we had more than one exception that could occur inside of our try block,
		 * if we wanted to do something different for each time it caught a different exception,
		 * we could do something like the following
		 */
		
		try {
			File file = new File("test.txt");
			//Another way to read file contents and print - see below for other method
			FileInputStream fis = new FileInputStream(file);
			System.out.println("File Contents: " );
				int r = 0;
				while((r=fis.read()) != -1) {
					System.out.println((char)r);
				}
		} catch (IOException e) {
			System.out.println("This is an example of getting IOException: " + e);
		} catch (ArithmeticException e2) {
			System.out.println("This is an example of getting FileNotFoundException: " + e2);
		}
		
		createRuledLine();
		
		/*
		 * We could also handle it differently if a lot of different exceptions
		 * could appear in our try block by just simplifying the exception handling
		 * to just Exception.
		 */
		
		try {
			System.out.println("Hello World");
		} catch (Exception e) {
			System.out.println("We found an exception: " + e);
		}
		
		createRuledLine();
		
		/*
		 * When working with File Input/Output, it is trivial to have some sort
		 * of exception handling. If a file didn't exist, we would want to handle
		 * a FileNotFoundException. Likewise, if we had some sort of IO Exception,
		 * we would want to handle that accordingly as well.
		 */
		
		/*
		 * File IO
		 * 
		 * Reading, writing, and appending files in Java.
		 * 
		 * There are many different ways of reading, writing, and appending files in Java.
		 * For Writing and appending, I will be demonstrating the FileWriter class for demonstration
		 * For Reading, I will be demonstrating the BufferedReader class for demonstration
		 */
		
		/*
		 * Reading File
		 */
		ArrayList<String> contentsOfFile = new ArrayList<String>();
		
		try {
			File file = new File("TestRead.txt"); //Open the file
			BufferedReader reader = new BufferedReader(new FileReader(file)); //Initialize reader
			String line; //Placeholder for each line
			
			while((line = reader.readLine()) != null) {
				//This just prints all of the lines to the console
				System.out.println(line);
				
				//We could do more interesting things like store each line in a String ArrayList
				contentsOfFile.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		createRuledLine();
		
		/*
		 * To continue the example, I will iterate over
		 * the ArrayList contentsOfFile and display that
		 * it correctly will display the information in the reader
		 */
		for(int i = 0; i < contentsOfFile.size(); i++) {
			System.out.println(contentsOfFile.get(i));
		}
	}
	
	/*
	 * This is a method outside of the main method
	 * Creates a printed line to console when called
	 */
	public static void createRuledLine() {
		System.out.println("\n---------------------------------------------\n");
	}
}
