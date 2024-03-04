package sharesbroker;

public class Sell implements Command {
	
	private Shares shares;
	private int amount;
	
	public Sell(Shares shares, int amount) {
		this.shares = shares;
		this.amount = amount;
	}

	@Override
	public void execute() {
		this.shares.buyShares(amount);
	}

}
