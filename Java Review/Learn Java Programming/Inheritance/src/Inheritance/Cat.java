package Inheritance;

/**
 * Cat Object class definition
 * @author Anthony Narlock
 * 
 * Cat class is a child class of the Animal class.
 * A cat is an animal
 */
public class Cat extends Animal {
	
	//Default Cat constructor
	public Cat() {
		super(); //Super calls parent constructor, in this case, the default Animal constructor
	}
	
	//Overloaded cat constructor
	public Cat(int age, String name) {
		super(age, name); //Super calls parent constructor, in this case, the overloaded animal constructor
	}
	
	//This function overrides the makeNoise method in the animal class, giving uniqueness in Cat Object
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	
	@Override
	public String getNoise() {
		return "Meow";
	}
	
	//Notice the toString method is not changed.
	
}
