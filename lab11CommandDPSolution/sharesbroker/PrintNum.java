package sharesbroker;

public class PrintNum implements Command{

	private Shares shares;
	
	public PrintNum(Shares shares) {
		this.shares = shares;
	}
	
	@Override
	public void execute() {
		shares.printNumShares();
	}

}
