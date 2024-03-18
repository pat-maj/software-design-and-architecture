package lab15DependencyInjection;

import business.AbstractCreditCardService;
import business.AbstractLogger;
import business.Basket;
import business.FakeLogger;
import data.FakeCreditCardServiceFail;
import data.FakeCreditCardServiceSuccess;

public class TestBasketFactory extends BasketFactory{

	private final boolean success;
	
	public TestBasketFactory(boolean success) {
		this.success = success;
	}
	
	@Override
	public Basket createBasket() {
		AbstractLogger logger = new FakeLogger();

		AbstractCreditCardService fakeCreditCardService;
		
		if(success) {
			fakeCreditCardService = new FakeCreditCardServiceSuccess(); 
		} else {
			fakeCreditCardService = new FakeCreditCardServiceFail();
		}
		
		return new Basket(fakeCreditCardService, logger);
	}

}
