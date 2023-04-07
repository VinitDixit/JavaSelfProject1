package TestLearn.observerPattern.bpropertyChangeFlow;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**Here no need to create a list of news channels and call their update methods
 * has PropertyChangeSupport-- which acts as publisher does that for us
 * PropertyChangeListener are added/removed during sub/unsub
 *
 */
public class NewsAgency {
    String news;
    PropertyChangeSupport support;

    public NewsAgency() {
        this.support = new PropertyChangeSupport(this);
    }

    public void subscribe(PropertyChangeListener listener){
        this.support.addPropertyChangeListener(listener);
    }

    public void unsubscribe(PropertyChangeListener listener){
        this.support.removePropertyChangeListener(listener);
    }

    public void publishNews(String value){
        this.support.firePropertyChange("news",this.news,value);
        this.news=value;
    }
}
