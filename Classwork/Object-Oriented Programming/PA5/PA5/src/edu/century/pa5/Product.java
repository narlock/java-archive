/**
 * Program Description: Product Class, containing name, uid, desc, and price.
 * Author: Anthony Narlock
 * Assignment: PA5
 * Date: May 4, 2020
 * Class: CSCI 1082
 */

package edu.century.pa5;
import java.util.Comparator;

public class Product {
	//Product instance variables
	private String name;
	private int uid;
	private String desc;
	private double price;
	
	//Default Product constructor
	public Product() {
		this.name = null;
		this.uid = 0;
		this.desc = null;
		this.price = 0.0;
	}
	
	//Arugmented constructor
	public Product(String name, int uid, String desc, double price) {
		this.name = name;
		this.uid = uid;
		this.desc = desc;
		this.price = price;
	}
	
	
	//Accessor and mutator methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString method
	@Override
	public String toString() {
		return "" + uid + ", " + price + ", " + name + ", " + desc + "\n";
	}
	
	//Comparator Interface UID
	public static Comparator<Product> CompareById = new 
	Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.uid - p2.uid;
		}
	};
	
	//Comparator Interface Price
	public static Comparator<Product> CompareByPrice = new
	Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			if(p1.getPrice() > p2.getPrice())
				return 1;
			if(p1.getPrice() < p2.getPrice())
				return -1;
			return 0;
		}
	};
	
	//Comparator Interface Name
	public static Comparator<Product> CompareByName = new
	Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getName().compareTo(p2.getName());
		}
	};
	
	//Comparator Interface Description
	public static Comparator<Product> CompareByDescription = new
	Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getDesc().compareTo(p2.getDesc());
		}
	};
}
