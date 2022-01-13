package Inheritance;

/*
 * Child class of the Person class
 * A student is a person
 */
public class Student extends Person {
	//Student-specific attributes
	private double gpa;
	private String favoriteClass;
	
	//Default constructor
	public Student() {
		super(); //This represents default person constructor,
				 //Which we know will call the default animal constructor
		this.gpa = 0.0;
		this.favoriteClass = null;
	}
	
	//Overloaded constructor with initalization
	public Student(int age, String name, String language, double gpa, String favoriteClass) {
		super(age, name, language); //This calls the overloaded init constructor of Person,
									//Which then gets called to the overloaded Animal constructor
		this.gpa = gpa;
		this.favoriteClass = favoriteClass;
	}
	
	//Getters/Setters for Student attribute

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getFavoriteClass() {
		return favoriteClass;
	}

	public void setFavoriteClass(String favoriteClass) {
		this.favoriteClass = favoriteClass;
	}
	
	@Override
	public String toString() {
		
		//Notice that when we call super, we get access to all methods from both Person class and Animal class.
		return "Student " + super.getName() + "\nAge: " + super.getAge() + "\nLanguage: " + super.getLanguage()
			+ "\nGpa: " + gpa + "\nFavorite Class: " + favoriteClass;
	}
	
}
