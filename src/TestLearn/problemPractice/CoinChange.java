package TestLearn.problemPractice;

public class CoinChange {
    public static void main(String[] args) {
        int coins[] = { 2,5,10 };
        int n = coins.length;
        int sum = 50;
        count(coins, n, sum);
        //System.out.println(count(coins, n, sum));
    }

    static long count(int coins[], int n, int sum)
    {
        int table[] = new int[sum + 1];

        // Base case (If given value is 0)
        table[0] = 1;

        for (int i = 0; i < n; i++){
            for (int j = coins[i]; j <= sum; j++){
                table[j] += table[j - coins[i]];
            }
        }


        return table[sum];
    }
}
