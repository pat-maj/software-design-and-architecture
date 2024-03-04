package remote;

public class ChannelUp implements Command {
	
	private Television tv;
	
	public ChannelUp(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.channelUp();
	}

}