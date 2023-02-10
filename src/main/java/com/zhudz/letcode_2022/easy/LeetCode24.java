package com.zhudz.letcode_2022.easy;

/**
 * 24. 两两交换链表中的节点
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {

        if (head == null) return head;
        if (head.next == null) return head;


        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
