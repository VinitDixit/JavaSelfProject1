package TestLearn.observerPattern.basicFlow;

public class Client {
    public static void main(String[] args) {
        NewsAgency subject= new NewsAgency();
        Channel star= new ChannelStar();
        Channel zee= new ChannelZee();
        //subscribe to the agency subject to recceive news
        subject.subscribe(star);
        subject.subscribe(zee);

        subject.publishNews("This is a breaking news");
    }
}
