package TestLearn.factoryPattern;

public class TestDriver {
    public static void main(String[] args) {
        Billing cashBilling = BillingFactory.getBillingTran("CASH");
        cashBilling.billTransaction();

    }
}
