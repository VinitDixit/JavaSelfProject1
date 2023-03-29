import RuntimePoly.Bank;
import RuntimePoly.ICICI;
import RuntimePoly.SBI;

public class Main {
    public static void main(String[] args) {

        //RuntimePoly-- dynamic method dispatch
        //at compile time the method is checked if present in parent class. Bank in this case
        //at runtime the resolution happens as to which class method to call
        Bank b= new Bank();
        System.out.println("Bank Parent rate of interest::"+b.getRateOfInterest());
        Bank b1= new ICICI();
        System.out.println("Bank ICICI rate of interest::"+b1.getRateOfInterest());
        Bank b2= new SBI();
        System.out.println("Bank SBI rate of interest::"+b2.getRateOfInterest());

       // ICICI c= new Bank(); chicld class reference cannot refer to parent class object


    }
}