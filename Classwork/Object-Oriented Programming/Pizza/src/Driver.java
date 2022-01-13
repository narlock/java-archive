/*
 *  Pizza
 *  By: Anthony Narlock
 */

import java.text.NumberFormat;

public class Driver {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		Pizza p1 = new Pizza(1,1,2,3);
		System.out.println(p1.getDescription());
		System.out.println("Cost for p1: " + nf.format(p1.calcCost()));
		
		//Testing equality of pizza
		Pizza p2 = new Pizza(1,1,2,3);
		if(p1.equals(p2)) {
			System.out.println("p1 == p2");
		} else {
			System.out.println("p1 != p2");
		}
		
		//Testing equality of pizza, intentionally incorrect data type
		String p3 = new String("1,1,2,3");
		if(p1.equals(p3)) {
			System.out.println("p1 == p3");
		} else {
			System.out.println("p1 != p3");
		}
		
		System.out.println(p1);
	}
	
	
}
