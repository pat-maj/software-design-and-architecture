package remote;

public class ChannelDown implements Command {
	
	private Television tv;
	
	public ChannelDown(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.channelDown();
	}

}
