/*
 *  Anthony Narlock - CSCI 1082.01 - Zakaria Baani - Feb 18th, 2020 - PA2: Customer.java
 *  Purpose: creation of account class that demonstrates the essential uses of a class in Java
 *  by mimicking a Customer for everyday use.
 */

package edu.century.pa2;

public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private int id;
	private static int count;
	
	//Accessor and mutator methods for the data fields
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	//Default constructor, still setting correct id
	public Customer() {
		this.firstName = null;
		this.lastName = null;
		this.address = null;
		this.age = 0;
		
		
		this.id = 32000+(count * 10);
		count++;
	}
	
	//Contructor that creates a customer with a specified first name, last name
	//address, and age. Also, it generates the customer's id
	public Customer(String firstName, String lastName, String address, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;

		this.id = 32000+(count * 10);
		count++;
	}
	
	//Overwritten toString method. This method returns all details about the account
	@Override
	public String toString() {
		String customerInfo = "Customer [ID= " + id
				+ "\n\t\tFirstName= " + firstName
				+ "\n\t\tLastName= " + lastName
				+ "\n\t\tAge= " + age
				+ "\n\t\tAddress= " + address + "]";
		return customerInfo;
	}
	
	//Overwritten equals method. This method returns true if the calling object is equal
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Customer)) {
			System.err.println("Error: Incompatable types - must pass Customer Object");
			return false;
		}
		
		//Down casting
		Customer c = (Customer)object;
		boolean isEqual = (this.firstName == c.firstName
				&& this.lastName == c.lastName
				&& this.address == c.address
				&& this.age == c.age
				&& this.id == c.id);
			
		return isEqual;
	}
}
