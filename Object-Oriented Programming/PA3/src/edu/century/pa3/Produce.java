/**
 * Program Description: class Produce to hold Produce objects. Holds instance variable name
 * Author: Anthony Narlock
 * Assignment: PA3
 * Date: February 27th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa3;

public class Produce {
	private String name;
	private double pricePerBox;
	private int quantity;
	
	//Default constructor: in the instance that nothing is called
	public Produce() {
		this.name = null;
		this.pricePerBox = 0;
		this.quantity = 0;
	}
	
	//Appropriate constructor:
	public Produce(String name, double pricePerBox, int quantity) {
		this.name = name;
		this.pricePerBox = pricePerBox;
		this.quantity = quantity;
	}

	//Appropriate accessor and mutator methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPricePerBox() {
		return pricePerBox;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//toString method
	@Override
	public String toString() {
		String produceInfo = "Produce Name: " + name + " ";
		return produceInfo;
	}
	
}
