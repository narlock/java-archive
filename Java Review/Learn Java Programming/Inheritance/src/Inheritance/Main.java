package Inheritance;
/*
 * Author: Anthony Narlock
 * 
 * Description: This package describes the basics of inheritance inside of OOP using Java.
 * 
 * Inheritance is essentially the concept in which properties from one class can be used in another.
 * 
 * To describe the simple use of inheritance, I will link the following image inside of this package to describe the relationship
 * between the classes that are in this package.
 * 
 * Animal represents the top of the classes. It is a parent class to the child classes Person, Dog, and Cat
 * The Person class is also a parent class to Student and Teacher.
 * 
 * The way classes "get" inheritance in Java is through the keyword extends.
 * From here, the child class will have access to all methods, attributes, etc. of the parent class.
 * 
 * This does not work the opposite way. 
 * To understand this: A dog can be an animal (dog=child, animal=parent)
 * however, not all dogs are animals. (dog can never be parent class of animal)
 * 
 * Note: only 1 class can be inherited. You cannot extend multiple classes. (You can with interfaces though!)
 * 
 * Polymorphism is defined as the ability for an object to behave in multiple forms.
 * Typically when a parent class reference type of variable is used to refer to a child object.
 * 		There are 2 types of Polymorphism
 * 		1. Upcasting: Casting a subtype to a supertype, going up in the inhertiance tree (refer to diagram)
 * 			In order to use methods in any interface class, the object should be of the same class of implementation
 * 		2. Downcasting: Casting a subtype as a supertype, going down the inhertiance tree
 * 			It is done to access sub class features, done manually
 * 				Cat cat = new Cat();
 * 				Downcasting would be something like
 * 				Animal animal = new (Animal)cat;
 */


public class Main {
	public static void main(String[] args) {
		//Default Animal
		Animal defaultAnimal = new Animal();
		System.out.println(defaultAnimal.toString());
		
		createRuledLine();
		
		//Init Animal
		Animal initAnimal = new Animal(5, "Forrest");
		System.out.println(initAnimal.toString());
		
		createRuledLine();
		
		//Child class of Animal : Cat
		Cat thisCat = new Cat(4, "Harold");
		System.out.println(thisCat.toString());
		
		createRuledLine();
		
		//Child class defined as an animal:
		//Yes, you can define an instance of a child class by referring to parent.
		//However, it is not true to do the opposite (that is, we can't say Cat newCat = new Animal(); in any way
		//Since it is only possible because the Cat is an Animal. (an Animal is not necessarily a Cat)
		Animal otherCat = new Cat(3, "Jeff"); //Polymorphism
		System.out.println(otherCat.toString());
		
		createRuledLine();
		
		//Defining another animal, a dog
		Dog thisDog = new Dog(1, "Dino");
		Animal otherDog = new Dog(2, "Diamond"); //Polymorphism
		System.out.println(thisDog.toString());
		createRuledLine();
		System.out.println(otherDog.toString());
		
		createRuledLine();
		
		//Creating a Person object
		Person person1 = new Person(25, "Joe", "English");
		//This defines the age, 25, and name "Joe" into the attributes of the Animal class, which the person class inherits.
		//The language, is also in the constructor, specific to the person object.
		System.out.println(person1.toString()); //Uses specific toString defined in Person
		
		createRuledLine();
		
		//Creating a Student object
		Person student1 = new Student(20, "Anthony", "English", 3.7, "Computer Science"); //Using the overloaded Student constructor; polymorphism
		System.out.println(student1.toString());
		
		createRuledLine();
		
		Teacher teacher1 = new Teacher(35, "Andrea", "English", 50000, "Psychology");
		System.out.println(teacher1.toString());
		
	}
	
	/*
	 * This is a method outside of the main method
	 * Creates a printed line to console when called
	 */
	public static void createRuledLine() {
		System.out.println("\n---------------------------------------------\n");
	}
}
