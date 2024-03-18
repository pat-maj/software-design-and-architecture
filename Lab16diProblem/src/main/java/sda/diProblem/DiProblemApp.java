package sda.diProblem;

import com.google.inject.Guice;
import com.google.inject.Injector;

import sda.diProblem.business.Basket;

public class DiProblemApp {

	public static void main(String[] args) {

		DiProblemApp app = new DiProblemApp();
	    app.run();
	}

	public DiProblemApp() {
	}

	public void run() {

		//We are going to create the basket with its dependencies using the Google Guice DI Framework
		//Guice alleviates the need for factories
		//Create an injector using the ConfigurationModule;
		Injector injector = Guice.createInjector(new ConfigurationModule());
		//Now ask the injector for an instance of the class you want
		Basket basket = injector.getInstance(Basket.class);
		basket.chargeCreditCard(100.0, "1234 5678 9012 3456", 2026, 04);
	}

}
