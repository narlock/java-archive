
public class Driver {
	public static void main(String[] args) {
		College cc = new College("Century College", 10);
		Student s1 = new Student("John", 4.0, 4213);
		Student s2 = new Student("Kevin", 4.0, 4214);
		
		cc.add(s1);
		cc.add(s2);
		System.out.println(cc.toString());
		
		cc.remove("John");
		System.out.println(cc.toString());
		
		College ar = new College("Anoka Ramsey", 10);
		Student s3 = new Student("John", 4.0, 4213);
		Student s4 = new Student("Kevin", 4.0, 4214);
		Student s5 = new Student("Cameron", 2.5, 4215);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		System.out.println(ar.toString());
		
		ar.remove("Kevin");
		System.out.println(ar.toString());
	}
}
