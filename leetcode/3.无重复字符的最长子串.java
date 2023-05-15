import java.util.BitSet;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        BitSet bs = new BitSet(256);
        int result = 0;
        int left = 0;
        int right = 0;

        while (left < s.length()) {
            if (right < s.length() && !bs.get(s.charAt(right))) {
                bs.set(s.charAt(right));
                right++;
            } else {
                bs.clear(s.charAt(left));
                left++;
            }
            result = Math.max(result, right - left);

            if (left + result > s.length()) {
                break;
            }
        }

        return result;
    }
}
// @lc code=end
