package TestLearn.proxyPattern;

/**
 * actual object which connect to internet
 */
public class RealInternet implements Internet{
    @Override
    public void connectTO(String host) {
        System.out.println("Real internet connect to host::"+host);
    }
}
