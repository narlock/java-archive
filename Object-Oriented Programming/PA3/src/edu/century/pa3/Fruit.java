/**
 * Program Description: class Fruit that is derived from Produce class
 * Author: Anthony Narlock
 * Assignment: PA3
 * Date: February 27th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa3;

public class Fruit extends Produce {
	private static final String type = "fruit";
	
	//Default constructor, in the instance that nothing is entered
	public Fruit() {
		super(null,0,0);
	}

	//Appropriate constructor, creates a fruit object with name, pricePerBox, and quantity
	public Fruit(String name, double pricePerBox, int quantity) {
		super(name,pricePerBox,quantity);
	}
	
	@Override
	public String toString() {
		String fruitInfo = "\nProduce name: " + super.getName()
				+ "\nPrice Per Box: " + super.getPricePerBox()
				+ "\nQuantity: " + super.getQuantity()
				+ "\nType: " + type;
		return fruitInfo;		
	}
}
