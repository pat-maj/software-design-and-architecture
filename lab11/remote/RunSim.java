package remote;

class RunSim {
	/*
	 * RunSim: main method to test use of RemoteControl
	 *
	 * RemoteControl (remote) can be used to turn on and off Television (tv),
	 * increment & decrement the channel, and set the channel number
	 *
	 */

	public static void main(String[] args) {
		// handle to remote, tv
		Television tv = new Television();
		tv.arrives();
		RemoteControl remote = new RemoteControl(tv);
		remote.displayFound();
		

		RunSim rs=new RunSim();
		rs.start(remote);
	}
	
	public void start(RemoteControl remote) {
		/*
		 * Rewrite to use the Command DP, invoker = remote receiver = tv with
		 * ConcreteCommands for switchOn, switchOff, channelUp, channelDown, setChannel
		 *
		 * Remember, you can only interact with the receiver ("tv") by using Command &
		 * invoker ("remote"). You are NOT allowed to invoke methods directly on
		 * Television
		 *
		 */

		// ensure remote is controlling the TV

		// turn tv on
		remote.televisionOn();

		// play with tv channels
		remote.televisionChannelUp();
		remote.televisionChannelUp();
		remote.televisionChannelUp();

		remote.televisionSetChannel(205);

		remote.televisionChannelDown();
		remote.televisionChannelDown();
		remote.televisionChannelDown();

		// turn tv off
		remote.televisionOff();
	}
}
