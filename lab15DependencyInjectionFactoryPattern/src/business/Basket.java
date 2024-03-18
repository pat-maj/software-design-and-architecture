package business;

public class Basket {
	
	private final AbstractCreditCardService creditCardService;
	private AbstractLogger logger;
	
	public Basket(AbstractCreditCardService creditCardService, AbstractLogger logger) {
		this.creditCardService = creditCardService;
		this.logger = logger;
	}
	
	public boolean chargeCreditCard(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		logger.log(cardNumber);
		return creditCardService.takePayment(amount, cardNumber, expiryYear, expiryMonth);
	}
}
