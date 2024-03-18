package lab15DependencyInjection;

import business.AbstractCreditCardService;
import business.Basket;
import data.ElavonCreditCardService;

public class RealBasketFactory extends BasketFactory{

	private final String merchCode;
	
	public RealBasketFactory(String merchCode) {
		this.merchCode = merchCode;
	}

	@Override
	public Basket createBasket() {
		AbstractCreditCardService realCreditCardService = new ElavonCreditCardService(merchCode);
		return new Basket(realCreditCardService);
	}
}
