package Inheritance;
/*
 * Child class of the Person class
 * A teacher is a person
 */
public class Teacher extends Person {
	//Teacher specific attributes
	private double salary;
	private String subject;
	
	public Teacher() {
		super();
		this.salary = 0.0;
		this.subject = null;
	}
	
	public Teacher(int age, String name, String language, double salary, String subject) {
		super(age, name, language);
		this.salary = salary;
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Teacher " + super.getName() + "\nAge: " + super.getAge() + "\nLanguage: " + super.getLanguage()
			+ "\nSalary: " + salary + "\nSubject: " + subject;
	}
}
