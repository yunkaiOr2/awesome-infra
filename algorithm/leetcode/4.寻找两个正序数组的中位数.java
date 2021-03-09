import javax.xml.crypto.Data;

/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 1) {
            return nums2[0] * 1.0;
        }
        if (nums1.length == 1 && nums2.length == 0) {
            return nums1[0] * 1.0;
        }
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

    }
}
// @lc code=end
