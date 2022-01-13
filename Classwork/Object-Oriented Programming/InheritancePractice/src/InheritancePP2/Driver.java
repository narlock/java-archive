package InheritancePP2;

public class Driver {

	public static void main(String[] args) {
		Email e1 = new Email("Java. Hi, how are you today?","bobthesender@java.com","anthonynarlock@narlock.com","Test");
		System.out.println(e1.toString());
		System.out.println(containsKeyword(e1,"Java"));
		System.out.println(containsKeyword(e1,"C++"));
	}
	
	public static boolean containsKeyword(Message messageObject, String keyword) {
		if(messageObject.toString().indexOf(keyword,0) >= 0)
			return true;
		return false;
	}
}
