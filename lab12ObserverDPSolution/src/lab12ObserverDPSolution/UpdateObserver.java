package lab12ObserverDPSolution;

import java.util.Observable;
import java.util.Observer;

public class UpdateObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("An update has been received");
	}

}
