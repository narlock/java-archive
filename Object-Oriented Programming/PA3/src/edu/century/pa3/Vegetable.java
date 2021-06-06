/**
 * Program Description: class Vegetable that is derived from Produce class
 * Author: Anthony Narlock
 * Assignment: PA3
 * Date: February 27th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa3;

public class Vegetable extends Produce {
	private static final String type = "vegetable";
		
	//Default constructor, in the instance that nothing is entered
	public Vegetable() {
		super(null,0,0);
	}

	//Appropriate constructor, creates a vegetable object with name, pricePerBox, and quantity
	public Vegetable(String name, double pricePerBox, int quantity) {
		super(name,pricePerBox,quantity);
	}
		
	@Override
	public String toString() {
		String vegInfo = "\nProduce name: " + super.getName()
				+ "\nPrice Per Box: " + super.getPricePerBox()
				+ "\nQuantity: " + super.getQuantity()
				+ "\nType: " + type;
		return vegInfo;		
	}
}
