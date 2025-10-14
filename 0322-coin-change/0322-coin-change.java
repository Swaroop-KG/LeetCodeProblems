class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1; // Represents infinity
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0; // 0 coins needed for amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
}