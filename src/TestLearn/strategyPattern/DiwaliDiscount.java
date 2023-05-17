package TestLearn.strategyPattern;

public class DiwaliDiscount implements Discounter{
    @Override
    public Double applyDiscount(Double amount) {
        return amount*0.8;
    }
}
