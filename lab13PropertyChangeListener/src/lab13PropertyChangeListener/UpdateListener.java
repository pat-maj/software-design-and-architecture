package lab13PropertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UpdateListener implements PropertyChangeListener{

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("An update has been received");
	}
}
