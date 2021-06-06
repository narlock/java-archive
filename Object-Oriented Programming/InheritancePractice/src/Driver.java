import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		
		CashPayment cp1 = new CashPayment(56.00);
		cp1.paymentDetails();
		
		CreditCardPayment ccp1 = new CreditCardPayment(1920.99,"Josh Gerval", new Date(), "123456");
		ccp1.paymentDetails();
	}
	
}
