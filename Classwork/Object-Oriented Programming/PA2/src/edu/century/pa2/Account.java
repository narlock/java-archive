/*
 *  Anthony Narlock - CSCI 1082.01 - Zakaria Baani - Feb 18th, 2020 - PA2: Account.java
 *  Purpose: creation of account class that demonstrates the essential uses of a class in Java
 *  by mimicking a real life bank account in which deposits and withdrawals can be made as well
 *  as the other essentials of a bank account.
 *  + combines other classes inside.
 */

package edu.century.pa2;
import java.util.Date;

public class Account {
	private double balance;
	private Date date;
	private long accountNumber;
	private double annualInterestRate;
	private Customer customer;
	
	//accessor and mutator methods for balance, annualInterestRate, date, customer
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Notice no mutator method for Date, do not want to change the date!
	public Date getDate() {
		return date;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	//Accessor method for account number
	public long getAccountNumber() {
		return accountNumber;
	}
	
	//Default constructor
	
	public Account() {
		balance = 0.0;
		this.accountNumber = (long) (Math.random() * 1000000000 - 1);
		annualInterestRate = 0.0;
		date = new Date();
		
	//A constructor that creates an account with the specified customer,
	//balance, and interest rate. Also ,it should generate the account
	//number and the current date
		
	}
	public Account(Customer customer, double balance, double annualInterestRate) {
		this.balance = balance;
		this.customer = customer;
		this.annualInterestRate = annualInterestRate;
		this.accountNumber = (long) (Math.random() * 1000000000 - 1);
		date = new Date();
	}
	
	//A method called getMonthlyInterestRate that returns the monthly
	//interest rate. Monthly interest rate is the annualInterestRate / 12.
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	//A method called getMonthlyInterest that returns the monthly interest.
	//Monthly interest is the balance * monthlyInterestRate.
	
	public double getMonthlyInterest() {
		return balance * ((annualInterestRate / 12) / 100);
	}
	
	//A method called generateAccountNumber that returns a 9 digit number.
	
	public long generateAccountNumber() {
		return accountNumber;
	}
	
	//A method called deposit that takes a parameter of type double. This
	//method will add the value of the parameter to the balance. Make sure
	//to not accept any negative values.
	
	public void deposit(double depositAmount) {
		if(depositAmount <= 0) {
			System.err.println("ERROR: " + depositAmount + " is an invalid deposit amount.");
		}
		else {
			balance += depositAmount;
		}
	}
	
	//A method called withdraw that takes a parameter of type double. This
	//method will subtract the value of the parameter from the balance.
	//Make sure to not accept negative values.
	
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount <= 0) {
			System.err.println("ERROR: " + withdrawAmount + " is an invalid withdrawal amount.");
		}
		else {
			balance -= withdrawAmount;
		}
	}
	
	//Override toString method. This method should return all the info
	//about this account.
	@Override
	public String toString() {
		String accountInfo = "BankAccount [Balance= " + balance
				+ "\n\tdate= " + date
				+ "\n\tAccountNumber= " + accountNumber
				+ "\n\tInterestRate= " + annualInterestRate
				+ "\n\t" + customer
				+ "\n\t]";
				
		return accountInfo;
	}
}
