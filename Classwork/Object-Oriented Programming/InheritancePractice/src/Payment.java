
public abstract class Payment {
	private double amount;
	
	public Payment() {
		this.amount = 0;
	}
	
	public Payment(double payment) {
		this.amount = payment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public abstract void paymentDetails();
	
}
