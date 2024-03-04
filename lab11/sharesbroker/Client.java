package sharesbroker;

public class Client {
	public static void main(String[] args) {
		Shares shares = new Shares();
		shares.printShareData();

		Broker broker = new Broker(shares);
		
		Client client=new Client();
		client.start(broker);

		
	}
	
	public void start(Broker broker) {
		broker.thankYouMessage();

		// implement all orders as they happen (not ideal...)
		broker.buyShares(10);
		broker.sellShares(5);
		broker.buyShares(25);

		// ensure print out balance
		broker.printNumShares();
	}
}
