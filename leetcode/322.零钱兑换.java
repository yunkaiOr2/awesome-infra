/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        int[] f = new int[amount + 1];
        int n = coins.length;
        f[0] = 0;
        int i,j;

        for (i = 1; i<= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (i >= coins[j] && f [i - coins[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
                }
            }
        }

        if (f[amount] == Integer.MAX_VALUE) {
            f[amount] = -1;
        }

        return f[amount];

    }
}
// @lc code=end

