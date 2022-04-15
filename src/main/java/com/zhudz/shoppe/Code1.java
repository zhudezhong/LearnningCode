package com.zhudz.shoppe;


import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description  将两个 降序 链表合并为一个新的 升序 链表并返回，新链表是通过拼接给定的两个链表的所有节点组成的
 */
class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
public class Code1 {
    public ListNode MergeList(ListNode l1, ListNode l2) {
        // write code here
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        return mergeTwoList(l1,l2);
    }

    /**
     * 将降序链表反转为升序链表
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        /*
        Stack<ListNode> stack = new Stack<>();

        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        ListNode tail = new ListNode(-1);
        while (stack.size() != 0) {
            tail.next = stack.pop();
        }

        return tail.next;
         */
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;

    }

    /**
     * 合并两个升序链表
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoList(ListNode l1,ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }
}