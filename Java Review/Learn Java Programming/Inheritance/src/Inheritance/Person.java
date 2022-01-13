package Inheritance;

/*
 * This is the first class that we see that is a parent class, and also a child class
 * It is a child class of an Animal (a person is an animal)
 * 
 * However, it is the parent class of Student class and Teacher class
 * 
 * If we want to get more technical, technically every class in Java
 * is a child class of the class 'Object'
 * 
 * This means that every class is an Object
 */
public class Person extends Animal {
	//An example of a special attribute of a person, language
	private String language;
	
	//Default constructor
	public Person() {
		super(0, null);
		this.language = null;
	}
	
	//Overloaded init Constructor
	public Person(int age, String name, String language) {
		super(age, name);
		this.language = language;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Most people nowadays would think it's weird to make noises...");
	}
	
	@Override
	public String getNoise() {
		return "N/A";
	}
	
	/*
	 * Creating getter/setter for language
	 */
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	//Notice that when we get name and age attributes, we call the parent object (animal)
	public String toString() {
		return "Person " + super.getName() + "\nAge: " + super.getAge() + "\nLanguage: " + language;
	}
}
