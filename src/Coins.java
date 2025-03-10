
public class Coins {

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 3};
        int sum1 = 4;
        int result1 = sumCount(coins1, sum1);
        if (result1 == 4) {
            System.out.println("Case 1 Success.");
        } else {
            System.out.println("Case 1 Fail.");
        }

        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        int result2 = sumCount(coins2, sum2);
        if (result2 == 5) {
            System.out.println("Case 2 Success.");
        } else {
            System.out.println("Case 2 Fail.");
        }
    }

    private static int sumCount(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }

}
