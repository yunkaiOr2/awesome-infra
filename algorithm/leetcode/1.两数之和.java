import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 2) {
            return new int[] { 0, 1 };
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[] { map.get(other), i };
            }

            map.put(nums[i], i);
        }
        return null;
    }
}
// @lc code=end
