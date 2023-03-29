package factoryPattern;

public class CashBilling implements  Billing{
    @Override
    public void billTransaction() {
        System.out.println("Cash Billing");
    }
}
