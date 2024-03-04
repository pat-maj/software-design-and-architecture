package remote;

public class On implements Command {
	
	private Television tv;
	
	public On(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

}
