package remote;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	
	List<Command> commands;
	
	public RemoteControl() {
		this.commands = new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void action() {
		commands.forEach(command -> command.execute());
	}
	
	public void displayFound() {
		System.out.println("We have found the remote!");
	}
}
