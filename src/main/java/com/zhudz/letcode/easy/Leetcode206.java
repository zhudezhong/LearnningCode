package com.zhudz.letcode.easy;

/**
 * 206. 反转链表
 */

public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            //将cur.next指针指向prev，并用next节点存储cur当前指针的下一节点
            ListNode next = cur.next;
            cur.next = prev;

            //prev指针和cur指针后移一位
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
