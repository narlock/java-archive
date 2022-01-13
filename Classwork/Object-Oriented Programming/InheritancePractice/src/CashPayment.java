
public class CashPayment extends Payment {

	public CashPayment(double payment) {
		super(payment);
	}
	
	@Override
	public void paymentDetails() {
		System.out.print("The amount of the payment was " + super.getAmount() + " in cash.\n");
	}
}
