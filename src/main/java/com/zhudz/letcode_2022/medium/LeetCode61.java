package com.zhudz.letcode_2022.medium;


import com.zhudz.letcode_2022.easy.ListNode;

/**
 * @Auther zhudezhong
 * @Description 61. 旋转链表
 */
public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
	if (k == 0 || head == null || head.next == null) {
	    return head;
	}
	int n = 1;
	ListNode iter = head;
	while (iter.next != null) {
	    iter = iter.next;
	    n++;
	}
	int add = n - k % n;
	if (add == n) {
	    return head;
	}
	iter.next = head;
	while (add-- > 0) {
	    iter = iter.next;
	}
	ListNode ret = iter.next;
	iter.next = null;
	return ret;
    }
}