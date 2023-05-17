package TestLearn.problemPractice;

import TestLearn.RuntimePoly.Bank;
import TestLearn.RuntimePoly.ICICI;
import TestLearn.RuntimePoly.SBI;

import java.util.ArrayList;
import java.util.List;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int array[]= new int[]{1,2,3,4};
        MissingNumber(array,5);

    }

    /**
     * find missing number in array
     * @param array
     * @param n
     */
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
