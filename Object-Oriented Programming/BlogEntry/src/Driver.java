import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		Date d = new Date();
		BlogEntry b = new BlogEntry("bob","one two three four five six seven eight in ten eleve ntwelve",d);
		BlogEntry b2 = new BlogEntry("bob2", "this is a test yes ",d);
		
		b.DisplayEntry();
		System.out.println("b.getSummary() = \n" + b.getSummary());
		
		System.out.println("\n\n");
		b2.DisplayEntry();
		System.out.println("b2.getSummary() = \n" + b2.getSummary());
	}
}
