/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        if (s == null || "".equals(s)) {
            return maxLen;
        }
        Map<String, Integer> charIndexMap = new HashMap<String, Integer>();
        int breakPoint = 1;
        String[] sStrs = s.split("");
        for(Integer i = 0; i< sStrs.length; i++) {
            Integer indexOfChar = charIndexMap.get(sStrs[i]);
            if (indexOfChar != null) {
                maxLen = Math.max(breakPoint > indexOfChar? i- breakPoint: i - indexOfChar, maxLen);
                breakPoint = indexOfChar;
            }
            charIndexMap.put(sStrs[i], i);
        }

        if (breakPoint == 1 ) {
            return sStrs.length;
        }
        return maxLen;
    }
}
// @lc code=end

