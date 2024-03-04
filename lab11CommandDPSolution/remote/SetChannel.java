package remote;

public class SetChannel implements Command {
	
	private Television tv;
	private int channel; 
	
	public SetChannel(Television tv, int channel) {
		this.tv = tv;
		this.channel = channel;
	}

	@Override
	public void execute() {
		tv.setChannel(channel);
	}

}
