package TestLearn.factoryPattern;

/**
 * Billing Factory return objects ofCash billing or Custody Billing based on input
 */
public class BillingFactory {
    public static Billing getBillingTran(String input){
        if(input.equalsIgnoreCase("CASH")){
            return new CashBilling();
        }else{
            return new CustodyBilling();
        }
    }
}
