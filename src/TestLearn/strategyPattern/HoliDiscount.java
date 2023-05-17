package TestLearn.strategyPattern;

public class HoliDiscount implements Discounter{
    @Override
    public Double applyDiscount(Double amount) {
        return amount*0.5;
    }
}
