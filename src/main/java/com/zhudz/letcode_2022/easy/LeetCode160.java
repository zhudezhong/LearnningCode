package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 160. 相交链表
 */
public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        int lenA = 0;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }

        int lenB = 0;
        while (curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        int sub = lenA - lenB;
        if (sub >= 0){
            while (sub > 0) {
                curA = curA.next;
                sub--;
            }
        }else {
            while (sub < 0) {
                curB = curB.next;
                sub++;
            }
        }
        while (curA != null && curB != null){
            if (curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}