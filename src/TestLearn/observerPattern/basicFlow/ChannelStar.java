package TestLearn.observerPattern.basicFlow;

public class ChannelStar implements Channel{
    String news;
    @Override
    public void update(String news) {
        this.news=news;
        System.out.println("Channel Star displaying the latest news::"+this.news);
    }
}
