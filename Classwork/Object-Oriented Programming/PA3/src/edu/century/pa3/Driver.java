/**
 * Program Description: class Driver that is used to test code
 * Author: Anthony Narlock
 * Assignment: PA3
 * Date: February 27th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa3;

public class Driver {
	public static void main(String[] args) {
		//Suppose a truck, that starts with size of 3: meaning 3 objects can be in the truck
		TruckOfProduce truck = new TruckOfProduce(3);
		
		//testing addProduce method for initialization
		truck.addProduce("Apple", 1, 5, "fruit");
		truck.addProduce("Potato", 2, 10, "vegetable");
		truck.addProduce("Banana", 3, 8, "fruit");
		
		//Test Truck toString
		System.out.println("Truck toString method Test: ");
		System.out.println(truck.toString());
		
		//Test Search
		System.out.println("Truck Search method Test: ");
		System.out.println("Is Apple inside of the truck? " + truck.search("Apple"));
		System.out.println("Is Cucumber inside of the truck? " + truck.search("Cucumber"));
	
		//Test ComputeTotal
		System.out.println("\nTruck computeTotal method Test: ");
		System.out.println("Total = " + truck.computeTotal());
		
		//Test Ensure Capacity
		System.out.println("\nTruck ensureCapcity method Test: ");
		System.out.println("Capacity before change: " + truck.getCapacity());
		truck.ensureCapacity();
		System.out.println("Capacity after change: " + truck.getCapacity());
		
		//Adding to the truck after the capacity update:
		System.out.println("\nAdding more to the truck after doubling capacity: ");
		truck.addProduce("Tomato", 4, 20, "fruit");
		System.out.println("Truck toString method Test: ");
		System.out.println(truck.toString());
		
		//Testing remove
		System.out.println("\nTruck remove method test: ");
		System.out.println("Removing Potato from Truck....");
		if(truck.remove(new Vegetable("Potato", 2, 10))) 
			System.out.println("Potato was removed.");
		else
			System.err.println("Potato was NOT removed.");
		
		//Testing final toString after Potato being removed (Should display [index 2 is empty]
		System.out.println("\nTruck toString method Test: ");
		System.out.println(truck.toString());
	}
}
