package data;

import business.AbstractCreditCardService;

public class FakeCreditCardServiceFail extends AbstractCreditCardService{

	public FakeCreditCardServiceFail() {
	}
	
	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		
		System.out.println("Using fake credit card service that fails");
		return false;
	}

}
