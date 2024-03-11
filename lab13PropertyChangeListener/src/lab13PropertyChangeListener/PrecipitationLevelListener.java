package lab13PropertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PrecipitationLevelListener implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		Object oldPrecipitation = evt.getOldValue();
		Object newPrecipitation = evt.getNewValue();
		System.out.println("Level of precipitatio changed from " + oldPrecipitation + " to: " + newPrecipitation);
	}

}
