
public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student("John","CC", 3.0);
		System.out.println(s1.toString());
		
		Faculty f1 = new Faculty("Zak", "Computer Science Department","Administrator");
		System.out.println("\n" + f1.toString());
	}
}
