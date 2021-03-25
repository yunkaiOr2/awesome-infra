import java.util.Map;
/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    /**
     * f(n) = f(n -1) + f(n-2)
     */
    private Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return cache.computeIfAbsent(n -1, key -> climbStairs(key)) + cache.computeIfAbsent(n - 2, key -> climbStairs(key));
    }
}
// @lc code=end

