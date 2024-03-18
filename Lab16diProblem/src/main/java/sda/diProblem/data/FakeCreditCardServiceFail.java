package sda.diProblem.data;
import com.google.inject.Inject;

import sda.diProblem.business.AbstractCreditCardService;
import sda.diProblem.business.AbstractLogger;


public class FakeCreditCardServiceFail extends AbstractCreditCardService {

	private AbstractLogger logger;
	
	@Inject
	public FakeCreditCardServiceFail(AbstractLogger logger) {
		this.logger = logger;
	}
	
	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		logger.log(cardNumber);
		System.out.println("Using fake credit card service that fails");
		return false;
	}
}
