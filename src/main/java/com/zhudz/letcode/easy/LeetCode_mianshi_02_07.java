package com.zhudz.letcode.easy;

/**
 * @Auther zhudezhong
 * @Description 面试题 02.07. 链表相交
 */
public class LeetCode_mianshi_02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;


        int lenA = 0;
        int lenB = 0;
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }

        while (curB != null) {
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;

        if (lenA > lenB) {
            int n = lenA - lenB;
            while (n-- > 0 && curA != null) {
                curA = curA.next;
            }
            while (curA != null && curB != null) {
                if (curA == curB) return curA;
                curA = curA.next;
                curB = curB.next;
            }
        } else {

            int n = -(lenA - lenB);
            while (n-- > 0 && curB != null) {
                curB = curB.next;
            }
            while (curA != null && curB != null) {
                if (curA == curB) return curA;
                curA = curA.next;
                curB = curB.next;
            }
        }
        return null;
    }
}