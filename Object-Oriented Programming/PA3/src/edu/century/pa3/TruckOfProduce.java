/**
 * Program Description: class TruckOfProduce: keeps track of the boxes of fruits and vegetables in the truck
 * Author: Anthony Narlock
 * Assignment: PA3
 * Date: February 27th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa3;

public class TruckOfProduce {
	private Produce[] produce = null;
	
	//Constructor that accepts an integer to initialize the array of Produce
	public TruckOfProduce(int size) {
		this.produce = new Produce[size];
	}
	
	//addProduce method: adds either fruit or vegetable to the array
	public void addProduce(String name, double pricePerBox, int quantity, String type) {
		
		for(int i = 0; i < produce.length; i++) {
			if(produce[i] == null) {
				if(type == "fruit") {
					Produce addedProduce = new Fruit(name, pricePerBox, quantity);
					produce[i] = addedProduce;
					break;
				}
				else if(type == "vegetable") {
					Produce addedProduce = new Vegetable(name, pricePerBox, quantity);
					produce[i] = addedProduce;
					break;
				}
			}
		}
	}
	
	//search method that accepts a name string, returns true if the name exists
	public boolean search(String name) {
		for(int i = 0; i < produce.length; i++) {
			if(produce[i].getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	//remove method that accepts a produce object and returns true if the produce is found and removed
	public boolean remove(Produce p) {
		for(int i = 0; i < produce.length; i++) {
			//If found, return true
			if(produce[i].toString().equals(p.toString())) {
				produce[i] = null;
				return true;
			}
		}
		
		//Not found. return false
		return false;
	}
	
	//computeTotal method that will return the cost of all the produce in truck
	public double computeTotal() {
		double total = 0;
		for(int i = 0; i < produce.length; i++) {
			total += (produce[i].getPricePerBox() * produce[i].getQuantity());
		}
		return total;
	}
	
	//ensureCapacity method: doubles the sizes of the array to ensure capacity 
	public void ensureCapacity() {
		Produce temp[] = new Produce[produce.length * 2];
		for(int i = 0; i < produce.length; i++) {
			temp[i] = produce[i];
		}
		produce = temp;
	}
	
	//toString method that returns all of the produce in truck
	@Override
	public String toString() {
		String truckInfo = "";
		
		for(int i = 0; i < produce.length; i++) {
			if(produce[i] == null)
				truckInfo += "[Index " + (i+1) + " is empty]\n";
			else
			truckInfo += "[Index " + (i+1) + produce[i].toString() + "]\n";
		}
		return truckInfo;
	}
	
	//My own added method, it just returns the current capacity
	public int getCapacity() {
		return produce.length;
	}
}
