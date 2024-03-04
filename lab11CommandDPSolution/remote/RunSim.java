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
		RemoteControl remote = new RemoteControl();
		remote.displayFound();
		

		RunSim rs=new RunSim();
		rs.start(remote, tv);
	}
	
	public void start(RemoteControl remote, Television tv) {
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
		remote.addCommand(new On(tv));

		// play with tv channels
		remote.addCommand(new ChannelUp(tv));
		remote.addCommand(new ChannelUp(tv));
		remote.addCommand(new ChannelUp(tv));
		
		remote.addCommand(new SetChannel(tv, 205));

		remote.addCommand(new ChannelDown(tv));
		remote.addCommand(new ChannelDown(tv));
		remote.addCommand(new ChannelDown(tv));
		
		// turn tv off
		remote.addCommand(new Off(tv));
		
		remote.action();
	}
}
