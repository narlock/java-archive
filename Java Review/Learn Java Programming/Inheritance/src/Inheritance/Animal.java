package Inheritance;

/**
 * Animal Object class definition
 * @author Anthony Narlock
 */

public class Animal {
	//Attributes of aninmal class
	private int age;
	private String name;
	
	//Default animal constructor
	public Animal() {
		this.age = 0;
		this.name = null;
	}
	
	//Overloaded constructor with attribute assignment
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//Methods for Animals
	public void makeNoise() {
		System.out.println("*some animal noise*");
	}
	
	public String getNoise() {
		return "*some animal noise*";
	}
	
	@Override
	public String toString() {
		return "Animal " + name + "\nAge: " + age + "\nSound: " + getNoise();
	}
	
	//Getters/Setters for animal attributes
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
