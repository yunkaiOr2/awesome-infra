/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode next = head;
        boolean carry = false;
        int towNumbersSum = 0;

        while (l1 != null || l2 != null) {
            towNumbersSum = 0;
            if (l1 != null) {
                towNumbersSum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                towNumbersSum += l2.val;
                l2 = l2.next;
            }

            if (carry) {
                ++towNumbersSum;
            }

            next.next = new ListNode(towNumbersSum % 10);
            carry = towNumbersSum >= 10;
            next = next.next;
        }

        if (carry) {
            next.next = new ListNode(1);
        }

        return head.next;

    }
}
// @lc code=end
