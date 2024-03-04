/* 
 * INVOKER
 * 
 */
package sharesbroker;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	List<Command> commands;

	public Broker() {
		this.commands = new ArrayList<>();
	}
	
	public void thankYouMessage() {
		System.out.println("Thank you for opening a new broker with us today");
	}
	
	private void action(Command command) {
		command.execute();
	}

	public void takeOrder(Command command) {
		this.commands.add(command);
	}
	
	public void placeOrders() {
		this.commands.forEach(this::action);
	}
}
