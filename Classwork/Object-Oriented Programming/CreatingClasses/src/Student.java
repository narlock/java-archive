
public class Student {

	private String fname, lname;
	private int id;
	
	public Student() {
		fname = null;
		lname = null;
		id = 0;
	}
	
	public Student(String fname, String lname, int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	
	public void setLastName(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Student)) {
			System.err.println("Error: Incompatable types - must pass ");
			return false;
		}
		
		//Down casting
		Student student = (Student)object;
		boolean isEqual = (this.fname.equals(student.fname)) 
				&& (this.lname.equals(student.lname)) 
				&& (this.id == student.id);  
		return isEqual;
	}
	
	@Override
	public String toString() {
		String studentInfo = "First Name: " + this.fname
				+ "\n Last Name: " + this.lname
				+ "\n        ID: " + this.id;
		return studentInfo;
	}
	
}
	
