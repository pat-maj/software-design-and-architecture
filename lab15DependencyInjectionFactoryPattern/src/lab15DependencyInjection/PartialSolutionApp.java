package lab15DependencyInjection;

import business.Basket;

public class PartialSolutionApp {

	public static void main(String[] args) {
		
		PartialSolutionApp app = new PartialSolutionApp();
		
		BasketFactory testBasketFactory = new TestBasketFactory(true);
		app.run(testBasketFactory);
		
		BasketFactory realBasketFactory = new RealBasketFactory("MerchCode");
		app.run(realBasketFactory);
	}

	public void run(BasketFactory basketFactory) {
		
		Basket basket = basketFactory.createBasket();
		basket.chargeCreditCard(199.99, "1234 1234 1234 1234", 2069, 03);
	}
}
