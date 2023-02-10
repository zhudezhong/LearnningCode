package com.zhudz.letcode_2022.easy;

/**
 * 206. 反转链表
 */

public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        result.next = null;

        while (head != null){
            ListNode tmp = head;
            head = head.next;

            ListNode next = result.next;
            result.next = tmp;
            result.next.next = next;

        }

        return  result.next;
    }
}
