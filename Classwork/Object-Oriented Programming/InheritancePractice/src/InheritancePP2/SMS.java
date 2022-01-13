package InheritancePP2;

public class SMS extends Message {

	private int recipientContactNo;
	
	public SMS(String message, int contactNum) {
		super(message);
		this.recipientContactNo = contactNum;
	}

	public int getRecipientContactNo() {
		return recipientContactNo;
	}

	public void setRecipientContactNo(int recipientContactNo) {
		this.recipientContactNo = recipientContactNo;
	}
	
	@Override
	public String toString() {
		return "Incoming SMS from: " + recipientContactNo + " reads: \n" + super.toString(); 
	}
}
