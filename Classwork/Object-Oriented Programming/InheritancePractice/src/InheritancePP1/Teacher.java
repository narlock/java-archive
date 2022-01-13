package InheritancePP1;

public class Teacher extends Person {
	private String subjectName;
	private double salary;
	
	public Teacher(String firstName, String lastName, String subjectName, double salary) {
		super(firstName, lastName);
		this.subjectName = subjectName;
		this.salary = salary;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Subject Name: " + subjectName + "\nSalary: $" + salary + "\n");
	}
}
