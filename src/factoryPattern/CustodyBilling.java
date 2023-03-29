package factoryPattern;

public class CustodyBilling implements Billing{
    @Override
    public void billTransaction() {
        System.out.println("Custody Billing");
    }
}
