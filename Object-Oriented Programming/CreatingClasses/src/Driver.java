
public class Driver {
	
	public void display(Student s) {
		System.out.println(s.toString());
	}
	
	public void display(double d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setFirstName("Anthony");
		s1.setLastName("Narlock");
		s1.setId(75120011);
		System.out.println("==========S1 INFO===========");
		System.out.println("First Name: " + s1.getFirstName());
		System.out.println("Last Name: " + s1.getLastName());
		System.out.println("ID: " + s1.getId());
		
		Student s2 = new Student("Kevin","Lin",100);
		System.out.println("==========S2 INFO===========");
		System.out.println("First Name: " + s2.getFirstName());
		System.out.println("Last Name: " + s2.getLastName());
		System.out.println("ID: " + s2.getId());
		
		Student s3 = new Student("Kevin","Lin",100);
		if(s3.equals(s2)) {
			System.out.println("s3 == s2");
		} else {
			System.out.println("s3 != s2");
		}
			
		String s4 = new String("Not,Kevin,100");
		if(s3.equals(s4)) {
			System.out.println("s3 == s2");
		} else {
			System.out.println("s3 != s2");
		}
		
		Driver obj = new Driver();
		obj.display(s1);
		
		double d = 5.00;
		obj.display(d);
		System.out.println(d);
	}
	
	
}
