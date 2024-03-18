package data;

import business.AbstractCreditCardService;
import business.AbstractLogger;

public class ElavonCreditCardService extends AbstractCreditCardService{

	private final String merchantCode;
	private AbstractLogger logger;
	
	public ElavonCreditCardService(String merchantCode, AbstractLogger logger) {
		this.merchantCode = merchantCode;
		this.logger = logger;
	}
	
	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		logger.log(cardNumber);
		System.out.println("Using real credit card service");
		System.out.println("Oh no, maxed out Steve's Credit Card");
		return false;
	}

}
