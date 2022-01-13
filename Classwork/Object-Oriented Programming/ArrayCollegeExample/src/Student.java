
public class Student {
	private String name;
	private double GPA;
	private int id;
	
	public Student(String name, double GPA, int id) {
		this.name = name;
		this.GPA = GPA;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name:" + name + " , GPA:" + GPA + " , ID:" + id + "]";
	}
}
