package com.zhudz.letcode_2022.easy;

/**
 * 203. 移除链表元素  递归类型求解
 */
public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        ListNode pre = new ListNode();
        pre.next = head;

        ListNode cur = head;

        ListNode result = pre;
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else {
                cur = cur.next;
                pre = pre.next;
            }
        }

        return result.next;
    }
}
