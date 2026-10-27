class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int res = dfs(coins, amount);
        return res != Integer.MAX_VALUE ? res : -1;
    }

    private int dfs(int[] coins, int amount){
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if(dp[amount] != -1) return dp[amount];
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < coins.length ; i++){
            int ans = dfs(coins, amount - coins[i]);
            if(ans != Integer.MAX_VALUE){
                min = Math.min(min, 1 + ans);
            }
        }
        return dp[amount] = min;
    }
}
