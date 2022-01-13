package InheritancePP2;

public class Email extends Message {
	private String sender, receiver, subject;
	
	public Email(String message, String sender, String receiver, String subject) {
		super(message);
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		String emailInfo = "Incoming Email \n----------" 
				+ "\nFrom: " + sender
				+ "\nTo: " + receiver
				+ "\nSubject: " + subject + "\n----------\n"
				+ super.toString();
		return emailInfo;
		
	}

}
