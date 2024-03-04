package remote;

public class Off implements Command {
	
	private Television tv;
	
	public Off(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

}
