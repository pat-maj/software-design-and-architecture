package lab12ObserverDPSolution;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.addObserver(new PrecipitationLevelObserver());
		weatherData.addObserver(new UpdateObserver());
		
		String[] predictions = {"20%", "40%", "63%", "78%", "92%"};
		
		for(String prediction: predictions) {
			weatherData.eventOccured(prediction);
		}
	}

}
