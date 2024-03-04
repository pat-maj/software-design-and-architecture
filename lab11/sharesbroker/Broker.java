/* 
 * INVOKER
 * 
 */
package sharesbroker;

public class Broker {
	Shares shares;

	public Broker(Shares s) {
		this.shares = s;
		
	}
	
	public void thankYouMessage() {
		System.out.println("Thank you for opening a new broker with us today");
	}

	public void buyShares(int n) {
		shares.buyShares(n);
	}

	public void sellShares(int n) {
		shares.sellShares(n);
	}

	public void printNumShares() {
		shares.printNumShares();
	}

}
