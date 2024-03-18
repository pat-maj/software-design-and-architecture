package data;

import business.AbstractCreditCardService;

public class FakeCreditCardServiceSuccess extends AbstractCreditCardService{

	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		System.out.println("Using fake credit card service that succeeds");
		return true;
	}

}
