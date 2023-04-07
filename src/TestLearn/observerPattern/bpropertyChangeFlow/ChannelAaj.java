package TestLearn.observerPattern.bpropertyChangeFlow;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ChannelAaj implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object newValue = evt.getNewValue();
        System.out.println("Breaking news from Aaj news::"+(String)newValue);
    }
}
