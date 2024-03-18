package sda.diProblem.business;
import java.util.UUID;

import com.google.inject.Inject;

//Basket now depends on an abstraction
public class Basket {

	private final AbstractCreditCardService creditCardService;
	private AbstractLogger logger;
	private AbstractOrderRepository orderRepo;
	
	//Java class constructors that are annotated with @Inject can be called by Guice
	//during which the constructors' arguments will be created and provided by Guice 
	@Inject
	public Basket(AbstractCreditCardService creditCardService, AbstractLogger logger, AbstractOrderRepository orderRepo) {
		this.creditCardService = creditCardService;
		this.logger = logger;
		this.orderRepo = orderRepo;
	}

	public boolean chargeCreditCard(double amount, String cardNumber, int expiryYear, int expiryMonth) {
		logger.log(cardNumber);
		createAndSaveOrder(amount);
		return creditCardService.takePayment(amount, cardNumber, expiryYear, expiryMonth);
	}
	
	public void createAndSaveOrder(double amount) {
		Order order = createOrder(amount);
		saveOrder(order);
		
	}
	
	private void saveOrder(Order order) {
		this.orderRepo.put(order);
	}
	
	private Order createOrder(double amount) {
		UUID id = UUID.randomUUID();
		return new Order(id, amount);
	}
}
