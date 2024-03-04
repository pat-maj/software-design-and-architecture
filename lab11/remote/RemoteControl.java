/*
 * Pre-Command DP, a "RemoteControl" object will invoke actions 
 * directly on a "Television" object
 *
 */
package remote;

public class RemoteControl {

	private Television tv;

	public RemoteControl(Television tv) {
		this.tv = tv;
	}

	public void displayFound() {
		System.out.println("We have found the remote!");
	}

	

	public void televisionChannelDown() {
		tv.channelDown();
	}

	public void televisionChannelUp() {
		tv.channelUp();
	}

	public void televisionOff() {
		tv.off();
	}

	public void televisionOn() {
		tv.on();
	}

	public void televisionSetChannel(int channel) {
		tv.setChannel(channel);
	}
}
