import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        int left = 0;
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (charIndexMap.containsKey(s.charAt(i))) {
                left = Math.max(left, charIndexMap.get(s.charAt(i)) + 1);
            }
            charIndexMap.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}
// @lc code=end
