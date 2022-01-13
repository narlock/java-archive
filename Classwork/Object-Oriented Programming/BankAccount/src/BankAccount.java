/*
 *  Bank Account
 *  By: Anthony Narlock
 *  CSCI 1082 - Section 1
 *  
 */

import java.text.NumberFormat;
import java.util.*;

public class BankAccount {
	public static void main(String[] args) {
		//Declaration of variables: attributes for account, balances and withdrawals, and variables for ending dollar outputs
		String name, address, city, state, zip, ssn;
		double balance, initialBalance, deposit1, withdraw1, withdraw2;
		int hundreds, twenties, tens, fives, ones, temp;
		String textBar = "--------------------"; //Created filler string to save space and make code look cleaner
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Number format $0.00
		Scanner input = new Scanner(System.in); //Buffer stream: everything inputed will stay 
												//in buffer until sent to program.
												//input.close() when you are done with buffer
		
		//Introduction and title to the program
		System.out.println("Welcome to CS Bank.");
		System.out.println("To open a checking account, please provide us with the following information:");
		
		//Input statements to receive the correct information for opening a checking account
		System.out.print("Full Name: ");
		name = input.nextLine(); 
		while(name.isEmpty()) {
			System.out.print("ERROR: Please enter Full Name: ");
			name = input.nextLine();
		}
		
		System.out.print("Enter Street Address: ");
		address = input.nextLine();
		while(address.isEmpty()) {
			System.out.print("ERROR: Please enter Street Address: ");
			address = input.nextLine();
		}
		
		System.out.print("Enter City: ");
		city = input.nextLine();
		while(city.isEmpty()) {
			System.out.print("ERROR: Please enter City: ");
			city = input.nextLine();
		}
		
		System.out.print("Enter State: ");
		state = input.nextLine();
		while(state.isEmpty()) {
			System.out.print("ERROR: Please enter State: ");
			state = input.nextLine();
		}
		
		//Entering the value for ZIP code, must be 5 digits
		System.out.print("Enter ZIP code: ");
		zip = input.nextLine();
		while(zip.length() != 5 || zip.isEmpty()) {
			System.out.print("Unrecognized ZIP Code. Please make sure your ZIP code is a 5 digit number: ");
			zip = input.nextLine();
			}
			
		//Entering the social security number: checks for length, emptiness, and makes sure hyphens are in correct place
		System.out.print("Enter SSN (e.g., XXX-XX-XXXX): ");
		ssn = input.nextLine();
		while(ssn.isEmpty() || ssn.length() != 11 || ssn.charAt(3) != '-' && ssn.charAt(6) != '-') {
			System.out.print("Invalid Social Secruity Number. Please re-enter (e.g., XXX-XX-XXXX): ");
			ssn = input.nextLine();
		}
		
		//Display account creation success
		System.out.println("<---------------------------------------->");
		System.out.println("Congratulations! Your account is now ready!");
		System.out.println("<---------------------------------------->\n");
		
		//Begin the initial deposit, deposit and withdraw questions.
		//Input validation is included to ensure that the user can not enter a number that is less than or equal to zero.
		System.out.print("How much money would you like to deposit to your account? $");
		initialBalance = input.nextDouble();
		input.nextLine();
		while(initialBalance <= 0) {
			System.out.print("ERROR: Please re-enter initial deposit: ");
			initialBalance = input.nextDouble();
		}
		
		System.out.print("Amount to deposit: ");
		deposit1 = input.nextDouble();
		input.nextLine();
		while(deposit1 <= 0) {
			System.out.print("ERROR: Please re-enter first deposit: ");
			deposit1 = input.nextDouble();
		}
		
		System.out.print("First amount to withdraw: $");
		withdraw1 = input.nextDouble();
		input.nextLine();
		while(withdraw1 <= 0) {
			System.out.print("ERROR: Please re-enter first withdrawal: ");
			withdraw1 = input.nextDouble();
		}
		
		System.out.print("Second amount to withdraw: $");
		withdraw2 = input.nextDouble();
		input.nextLine();
		while(withdraw2 <= 0) {
			System.out.print("ERROR: Please re-enter second withdrawal: ");
			withdraw2 = input.nextDouble();
		}
		
		//Close input Scanner
		input.close();
		
		//Calculate final balance
		balance = initialBalance + deposit1 - withdraw1 - withdraw2;
		
		//Final output - displays all of the information entered when creating the account
		//Then shows the account summary based on the amount of money deposited/withdrawn
		//Determines the number of $(100,20,10,5,1) that satisfy the final balance
		
		System.out.println("\n*************************************");
		System.out.printf("%-8s %s\n","","Account Information");
		System.out.println("*************************************");
		System.out.printf("%s | %s | %s | %s | %s | %s |\n",textBar,textBar,textBar,textBar,textBar,textBar);
		System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s |\n","Full Name","Address","City","State","Zipcode","SSN");
		System.out.printf("%s | %s | %s | %s | %s | %s |\n",textBar,textBar,textBar,textBar,textBar,textBar);
		System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s |\n",name,address,city,state,zip,ssn);
		System.out.printf("%s | %s | %s | %s | %s | %s |\n",textBar,textBar,textBar,textBar,textBar,textBar);
		System.out.println("*************************************");
		System.out.printf("%-8s %s\n","","Account Summary");
		System.out.println("*************************************");
		System.out.printf("%10s","Initial Deposit: ");
		System.out.println(nf.format(initialBalance));
		System.out.println("First Withdrawawl: " + nf.format(withdraw1));
		System.out.println("Second Withdrawal: " + nf.format(withdraw2));
		System.out.println("Deposit: " + nf.format(deposit1));
		System.out.println("Current Balance: " + nf.format(balance));
		System.out.println("*************************************");
		
		//Calculate 100s, 20s, 10s, 5s, 1s.
		temp = (int)balance;
		hundreds = temp / 100;
		System.out.printf("$100 bills: %5d\n", hundreds);
		
		temp = temp - (hundreds * 100);
		twenties = temp / 20;
		System.out.printf(" $20 bills: %5d\n", twenties);
		
		temp = temp - (twenties * 20);
		tens = temp / 10;
		System.out.printf(" $10 bills: %5d\n", tens);
		
		temp = temp - (tens * 10);
		fives = temp / 5;
		System.out.printf("  $5 bills: %5d\n", fives);
		
		temp = temp - (fives * 5);
		ones = temp / 1;
		System.out.printf("  $1 bills: %5d\n", ones);
		
		
	}
	
}
