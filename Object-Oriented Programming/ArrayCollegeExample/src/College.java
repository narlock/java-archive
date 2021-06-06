
public class College {
	//This is not static because we do not want to share the amount of students with other instances of college, different
	//colleges will have different number of students.
	private int numberOfCurrentStudents;
	private String name;
	private Student[] students;
	
	public College(String name, int size) {
		this.name = name;
		this.students = new Student[size];
		this.numberOfCurrentStudents = 0;
	}
	
	public boolean remove(String target) {
		for(int i = 0; i < numberOfCurrentStudents; i++) {
			if(students[i].getName() == target) {
				students[i] = students[numberOfCurrentStudents-1];
				numberOfCurrentStudents--;
				System.out.println("Student Removed Successfully");
				return true;
			}
		}
		return false;
	}
	
	public void add(Student student) {
			students[numberOfCurrentStudents] = student;
			numberOfCurrentStudents++;
		
	}
	
	@Override
	public String toString() {
		String info = "College Name: " + name +
				"\nCurrent enrolled: " + numberOfCurrentStudents +
				"\nList of Students:\n";
		for(int i = 0; i < numberOfCurrentStudents; i++) {
			if(students[i] != null)
			info += students[i].toString() + "\n";
		}
		
		return info;
	}
}
