import java.util.Date;

public class CreditCardPayment extends Payment {
	private String nameOnCard;
	private Date expirationDate;
	private String cardNumber;
	
	public CreditCardPayment(double payment, String nameOnCard, Date expirationDate, String cardNumber) {
		super(payment);
		this.nameOnCard = nameOnCard;
		this.expirationDate = expirationDate;
		this.cardNumber = cardNumber;
			
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void paymentDetails() {
		System.out.print("The amount of the payment was " + super.getAmount() + " through credit."
				+ "\n\tName on Card: " + nameOnCard
				+ "\n\tExpiration Date: " + expirationDate
				+ "\n\tCard Number: " + cardNumber);
		
	}
}
