package lab13PropertyChangeListener;

public class Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		UpdateListener ul = new UpdateListener();
		PrecipitationLevelListener pll = new PrecipitationLevelListener();
		
		wd.addPropertChangeListener(ul);
		wd.addPropertChangeListener(pll);
		
		wd.setPrecipitation("22%");
		wd.setPrecipitation("32%");
		wd.setPrecipitation("67%");
	}
}
