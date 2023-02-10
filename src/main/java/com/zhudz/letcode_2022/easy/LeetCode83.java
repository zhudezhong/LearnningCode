package com.zhudz.letcode_2022.easy;

/**
 * 83. 删除排序链表中的重复元素
 */
public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        //声明一个当前指针cur和一个下一节点指针next
        ListNode cur = null;
        ListNode next = null;

        if (head == null) return null;
        cur = head;
        next = head.next;
        while (cur != null && next != null){
            int value = cur.val;
            int nextValue = next.val;
            //如果值相等，next指针右移，cur指针继续指向next指针
            if (value == nextValue){
                next = next.next;
                cur.next = next;
            }else {
                //如果值不等，将cur.next指向当前next指针，然后cur和next指针右移
                cur.next = next;
                cur = cur.next;
                next = next.next;
            }
        }
        return head;
    }
}
