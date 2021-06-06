package InheritancePP1;

public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student("Matthew","Sherohman","CSCI 1082","Zak Baani");
		Student s2 = new Student("Anthony","Narlock", "CSCI 2061", "Lisa Minogue");
		
		Teacher t1 = new Teacher("Zak", "Baani", "CSCI 1082", 999999);
		Teacher t2 = new Teacher("Lisa", "Minogue", "CSCI 2061", 999999);
		
		s1.displayDetails();
		s2.displayDetails();
		t1.displayDetails();
		t2.displayDetails();
		
		
	}
}
