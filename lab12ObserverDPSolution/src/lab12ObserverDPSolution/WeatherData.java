package lab12ObserverDPSolution;

import java.util.Observable;

public class WeatherData extends Observable{

	public void eventOccured(String precipitation) {
		this.setChanged();
		this.notifyObservers(precipitation);
	}
}
