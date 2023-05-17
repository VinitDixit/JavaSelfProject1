package TestLearn.proxyPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy object which implements the internet interface and behaves like real object
 * Provides additional layer of security to check if any host can be safely accessed
 * by doing some action before passing the request to real object
 */
public class ProxyInternet implements Internet{
    Internet internet;
    static List<String> bannedSites= new ArrayList<>();
    static{
        bannedSites.add("UnsafeHost1");
        bannedSites.add("UnsafeHost2");
        bannedSites.add("UnsafeHost3");
    }
    @Override
    public void connectTO(String host) {
        if(bannedSites.contains(host)){
            throw new UnsafeInternetException("Cannot access Banned Site");
        }else{
            internet=new RealInternet();
            internet.connectTO(host);
        }
    }
}
