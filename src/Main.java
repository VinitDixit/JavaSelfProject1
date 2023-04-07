import TestLearn.RuntimePoly.Bank;
import TestLearn.RuntimePoly.ICICI;
import TestLearn.RuntimePoly.SBI;

import java.util.*;

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

        int array[]= new int[]{1,2,3,4};
        MissingNumber(array,5);

    }

    static void MissingNumber(int array[], int n) {
        // Your Code Here
        if(n==2){
            int num=2-array[0];
            System.out.println("Missing number::"+num);
        }
        List<Integer> numList= new ArrayList<>();
        for (int i : array){
            numList.add(i);
        }

        int actualSum=0;
        actualSum=(n*(n+1))/2;
        System.out.println("actualSum number::"+actualSum);
        int sum=0;
        for (Integer num : numList) {
            sum = sum + num;
        }
        System.out.println("sum number::"+sum);
        int missingNum=actualSum-sum;
        System.out.println("Missing number::"+missingNum);

    }
}