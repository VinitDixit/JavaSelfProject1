package TestLearn.proxyPattern;

public class ClientDriver {
    public static void main(String[] args) {
        //create a proxy object and call connect
        Internet internet= new ProxyInternet();
        try{
            internet.connectTO("UnsafeHost1");
            internet.connectTO("SafeHost");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception caught while connecting to host");
        }

    }
}
