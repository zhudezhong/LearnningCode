package com.zhudz.letcode_2022.easy;

/**
 * 876. 链表的中间结点
 */
public class LeetCode876 {
    public ListNode middleNode(ListNode head) {

        ListNode cur = head;
        int length = 0;
        //遍历链表，得到链表长度
        while (cur != null){
            cur = cur.next;
            length++;
        }

        cur = head.next;
        int left = 1;
        int right = 2;
        while (cur != null){
            if ((left + right) >= length) return cur;
            left++;
            right++;
            cur = cur.next;
        }
        return head;
    }
}
