/*
 * Author: Anthony Narlock
 * 
 * Description: This Java file describes a basic understanding of classes inside of OOP
 */

public class Classes {
	public static void main(String[] args) {
		Person person1 = new Person(20, "Tony"); //Creates a new Person Object
		System.out.println("person1's name is " + person1.getName()); //Prints out person1's attributes
		System.out.println("person1's age is " + person1.getAge());
		
		//If I wanted to change an attribute, I could do the following
		person1.setAge(21);
		System.out.println("It's " + person1.getName() + "'s birthday! They are now " + person1.getAge());
		
		//I can call that instance method like so
		person1.greeting();
	}
}


//In most implementations, you will never really ever make a class inside of a class, they will also always begin with "public" keyword
class Person { //Class header
	
	//Attributes, also referred to as instance variables
	private int age;
	private String name;
	
	//Constructor, a constructor without arguments is considered the Default Constructor
	public Person() {
		this.age = 0;
		this.name = "null";
	}
	
	//Overloaded constructor, with different arguments
	//This is a basic constructor in which attributes are entered before Object is created
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//Example of an instance method
	public void greeting() {
		System.out.println("Hello!");
	}
	
	//The following are accessors/mutator methods.
	//Also called getters/setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
