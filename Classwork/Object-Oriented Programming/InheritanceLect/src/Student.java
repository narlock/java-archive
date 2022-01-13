
public class Student extends Person {
	
	private double gpa;
	
	public Student(String name, String address, double gpa) {
		//super(); // This will call the no argument constructor from parent class. Java will do it for you
		super(name, address);
		this.gpa = gpa;
	}
	
	public Student(String name) {
		//Using this to call an overloading constructor
		this(name, "12", 4.0);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nGPA: " + gpa;
	}
}
