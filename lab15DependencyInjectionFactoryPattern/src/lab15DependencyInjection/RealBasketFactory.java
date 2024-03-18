package lab15DependencyInjection;

import business.AbstractCreditCardService;
import business.AbstractLogger;
import business.Basket;
import business.RealLogger;
import data.ElavonCreditCardService;

public class RealBasketFactory extends BasketFactory{

	private final String merchCode;
	
	public RealBasketFactory(String merchCode) {
		this.merchCode = merchCode;
	}

	@Override
	public Basket createBasket() {
		AbstractLogger logger = new RealLogger();
		AbstractCreditCardService realCreditCardService = new ElavonCreditCardService(merchCode, logger);
		return new Basket(realCreditCardService, logger);
	}
}
