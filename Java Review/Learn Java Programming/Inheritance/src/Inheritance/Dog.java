package Inheritance;

/**
 * Cat Object class definition
 * @author Anthony Narlock
 * 
 * Dog class is a child class of the Animal class.
 * A dog is an animal
 */
public class Dog extends Animal {
	//Default Cat constructor
	public Dog() {
		super(); //Super calls parent constructor, in this case, the default Animal constructor
	}
	
	//Overloaded cat constructor
	public Dog(int age, String name) {
		super(age, name); //Super calls parent constructor, in this case, the overloaded animal constructor
	}
	
	//This function overrides the makeNoise method in the animal class, giving uniqueness in Cat Object
	@Override
	public void makeNoise() {
		System.out.println("Woof");
	}
	
	@Override
	public String getNoise() {
		return "Woof";
	}
	
	//Notice the toString method is not changed.
}
