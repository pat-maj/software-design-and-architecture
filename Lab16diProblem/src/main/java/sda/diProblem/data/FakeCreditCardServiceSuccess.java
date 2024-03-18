package sda.diProblem.data;
import com.google.inject.Inject;

import sda.diProblem.business.AbstractCreditCardService;
import sda.diProblem.business.AbstractLogger;

public class FakeCreditCardServiceSuccess extends AbstractCreditCardService {
	
	AbstractLogger logger;
	
	@Inject
	public FakeCreditCardServiceSuccess(AbstractLogger logger) {
		this.logger = logger;
	}
	
	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		logger.log(cardNumber);
		System.out.println("Using fake credit card service that succeeds");
		return true;
	}
}
