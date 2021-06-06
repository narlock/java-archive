/*
 *  Calculator Example
 *  By: Anthony Narlock
 *  Date: January 28th, 2020
 */

import java.util.Scanner;

public class Calculator {

	public static double getSum(double num1, double num2) {
		return num1 + num2;
	}

	public static double getSubSum(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double getProduct(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double getQuotient(double num1, double num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, result;
		String operator;
		
		System.out.print("Enter first number: ");
		num1 = input.nextDouble();
		System.out.print("Enter operator: ");
		operator = input.next();
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		
		
		switch(operator) {
		case "+":
			result = getSum(num1,num2);
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case "-":
			result = getSubSum(num1,num2);
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case "*":
			result = getProduct(num1,num2);
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case "/":
			result = getQuotient(num1,num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		default:
			System.err.println("Invalid operator.");
			break;
		}
		
		
		input.close();
	}


	
}
