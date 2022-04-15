package com.zhudz.letcode.easy;

/**
 * 203. 移除链表元素  递归类型求解
 */
public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        //base case
        if (head == null) return head;

        //recursion relation
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }
}
