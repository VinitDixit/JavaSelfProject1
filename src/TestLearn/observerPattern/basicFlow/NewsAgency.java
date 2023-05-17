package TestLearn.observerPattern.basicFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * this is the subject class in observer pattern
 * it has subscribe- to subscribe to the agency
 * it has unsubscribe- to unsubscribe from the agency
 * Whenver a new news comes the agency notifies/publishes news to all channels
 */
public class NewsAgency {
    String news;
    List<Channel> channelList;

    public NewsAgency() {
        this.channelList = new ArrayList<>();
    }

    public void subscribe(Channel ch){
        this.channelList.add(ch);
    }

    public void unsubscribe(Channel ch){
        this.channelList.remove(ch);
    }

    public void publishNews(String news){
        this.news=news;
        this.channelList.forEach(ch->{
            ch.update(this.news);
        });
    }
}
