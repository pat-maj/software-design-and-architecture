package sharesbroker;

public class Client {
	public static void main(String[] args) {
		Shares shares = new Shares();
		shares.printShareData();

		Broker broker = new Broker();
		
		Client client=new Client();
		client.start(broker, shares);

		
	}
	
	public void start(Broker broker, Shares shares) {
		broker.thankYouMessage();

		// implement all orders as they happen (not ideal...)
		broker.takeOrder(new Buy(shares, 10));
		broker.takeOrder(new Sell(shares, 5));
		broker.takeOrder(new Buy(shares, 25));
		
		// ensure print out balance
		broker.takeOrder(new PrintNum(shares));
		
		// execute all orders
		broker.placeOrders();
	}
}
