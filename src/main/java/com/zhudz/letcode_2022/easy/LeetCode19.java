package com.zhudz.letcode_2022.easy;

/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

	ListNode dumb = new ListNode();
	ListNode pre = dumb;

	ListNode cur = head;
	int count = 0;
	while (cur != null) {
	    count++;
	    cur = cur.next;
	}

	pre.next = head;
	cur = head;
	int num = count - n + 1;
	int pos = 0;
	while (cur != null) {
	    if (++pos == num) {
		// ListNode tmp = cur;
		pre.next = cur.next;
	    }
	    cur = cur.next;
	    pre = pre.next;
	}

	return dumb.next;
    }
}
