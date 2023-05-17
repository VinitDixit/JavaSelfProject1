package TestLearn.problemPractice;

import TestLearn.RuntimePoly.Bank;
import TestLearn.RuntimePoly.ICICI;
import TestLearn.RuntimePoly.SBI;

import java.util.HashSet;
import java.util.Set;

public class MaxProfitPricesArray {
    public static void main(String[] args) {
        int array1[]= new int[]{1,2,3,4,5};
        maxProfit(array1);
    }

    /**
     * Find max profit in array
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                int diff = prices[i]-prices[i-1];
                profit=profit+diff;
            }
        }
        System.out.println("Max profit::"+profit);
        return profit;
    }
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        return s.size();
    }
}
