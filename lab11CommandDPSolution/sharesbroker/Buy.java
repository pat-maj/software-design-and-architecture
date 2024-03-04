package sharesbroker;

public class Buy implements Command {
	
	private Shares shares;
	private int amount;
	
	public Buy(Shares shares, int amount) {
		this.shares = shares;
		this.amount = amount;
	}

	@Override
	public void execute() {
		this.shares.buyShares(amount);
	}

}
