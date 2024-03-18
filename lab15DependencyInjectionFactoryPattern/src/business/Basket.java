package business;

public class Basket {
	private final AbstractCreditCardService creditCardService;
	
	public Basket(AbstractCreditCardService creditCardService) {
		this.creditCardService = creditCardService;
	}
	
	public boolean chargeCreditCard(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		return creditCardService.takePayment(amount, cardNumber, expiryYear, expiryMonth);
	}
}
