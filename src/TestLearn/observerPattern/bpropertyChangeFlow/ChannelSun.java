package TestLearn.observerPattern.bpropertyChangeFlow;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ChannelSun implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object newValue = evt.getNewValue();
        System.out.println("Breaking news from Sun news::"+(String)newValue);
    }
}
