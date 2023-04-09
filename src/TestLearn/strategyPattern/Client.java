package TestLearn.strategyPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Discounter diwaliDiscounter= new DiwaliDiscount();
        Discounter holiDiscounter= new HoliDiscount();

        Discounter diwaliDiscounter1=(amount)->{
            return (amount*0.7);
        };

        Double finalAmount=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        System.out.println("Enter the festival");
        String input = sc.next();
        if(input.equalsIgnoreCase("Diwali")){
            finalAmount=diwaliDiscounter1.applyDiscount(amount);
        }else if(input.equalsIgnoreCase("Holi")){
            finalAmount=holiDiscounter.applyDiscount(amount);
        }
        System.out.println("Final amount::"+finalAmount);


    }
}
