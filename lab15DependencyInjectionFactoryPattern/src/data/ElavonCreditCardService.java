package data;

import business.AbstractCreditCardService;

public class ElavonCreditCardService extends AbstractCreditCardService{

	private final String merchantCode;
	
	public ElavonCreditCardService(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	
	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		System.out.println("Using real credit card service");
		System.out.println("Oh no, maxed out Steve's Credit Card");
		return false;
	}

}
