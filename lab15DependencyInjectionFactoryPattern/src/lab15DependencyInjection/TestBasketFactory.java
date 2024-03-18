package lab15DependencyInjection;

import business.AbstractCreditCardService;
import business.Basket;
import data.FakeCreditCardServiceFail;
import data.FakeCreditCardServiceSuccess;

public class TestBasketFactory extends BasketFactory{

	private final boolean success;
	
	public TestBasketFactory(boolean success) {
		this.success = success;
	}
	
	@Override
	public Basket createBasket() {
		AbstractCreditCardService fakeCreditCardService;
		
		if(success) {
			fakeCreditCardService = new FakeCreditCardServiceSuccess(); 
		} else {
			fakeCreditCardService = new FakeCreditCardServiceFail();
		}
		
		return new Basket(fakeCreditCardService);
	}

}
