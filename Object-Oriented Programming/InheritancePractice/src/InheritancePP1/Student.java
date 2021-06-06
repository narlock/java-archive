package InheritancePP1;

public class Student extends Person {
	private int id;
	private String course;
	private String teacherName;
	
	public Student(String firstName, String lastName, String course, String teacherName) {
		super(firstName, lastName);
		this.course = course;
		this.teacherName = teacherName;
		this.id = (int) ((Math.random() * 500) + 100);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Student ID: " + id + "\nEnrolled Course: " + course + "\nInstructor Name: " + teacherName + "\n");
	}
	
}
