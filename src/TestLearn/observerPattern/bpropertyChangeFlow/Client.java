package TestLearn.observerPattern.bpropertyChangeFlow;


public class Client {
    public static void main(String[] args) {
        NewsAgency propertyChangeSupportAgency= new NewsAgency();
        ChannelAaj channelAaj = new ChannelAaj();
        ChannelSun channelSun = new ChannelSun();

        propertyChangeSupportAgency.subscribe(channelAaj);
        propertyChangeSupportAgency.subscribe(channelSun);

        propertyChangeSupportAgency.publishNews("Latest news");

    }

}
