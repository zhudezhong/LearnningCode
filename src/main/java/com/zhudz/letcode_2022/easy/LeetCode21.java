package com.zhudz.letcode_2022.easy;

/**
 * 21. 合并两个有序链表
 */

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //递归终止条件
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
