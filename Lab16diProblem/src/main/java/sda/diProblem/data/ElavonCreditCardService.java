package sda.diProblem.data;
import com.google.inject.Inject;

import sda.diProblem.business.AbstractCreditCardService;
import sda.diProblem.business.AbstractLogger;

public class ElavonCreditCardService extends AbstractCreditCardService {

	private final String merchantCode;
	private AbstractLogger logger;
	
	@Inject
	public ElavonCreditCardService(ElavonConfigurationOptions configuration, AbstractLogger logger) {

		this.merchantCode = configuration.getMerchantCode();
		this.logger = logger;
	}

	@Override
	public boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		// TODO actual integration code
		// Actually charge card
		logger.log(cardNumber);
		System.out.println("Using real credit card service");
		System.out.println("Oh no, maxed out Steve's Credit Card");
		return false;
	}
}
