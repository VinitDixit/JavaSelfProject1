package TestLearn.observerPattern.basicFlow;

public class ChannelZee implements Channel{
    String news;
    @Override
    public void update(String news) {
        this.news=news;
        System.out.println("Channel Zee displaying the latest news::"+this.news);
    }
}
