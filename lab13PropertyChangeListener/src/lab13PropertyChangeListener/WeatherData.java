package lab13PropertyChangeListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {
	private String precipitation;
	private PropertyChangeSupport propertyChangeSupport;
	
	public WeatherData() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}
	
	public void setPrecipitation(String precipitation) {
		String oldValue = this.precipitation;
		this.precipitation = precipitation;
		propertyChangeSupport.firePropertyChange("precipitation", oldValue, precipitation);
	}
}
