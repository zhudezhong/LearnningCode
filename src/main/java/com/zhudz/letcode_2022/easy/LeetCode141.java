package com.zhudz.letcode_2022.easy;

import java.util.HashMap;

/**
 * 141. 环形链表
 * 方法二：快慢指针。参考归兔赛跑案例
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        HashMap map = new HashMap<ListNode,Integer>();
        while (head != null){
            //map中不包含当前节点，将其加入到map集合中
            if (!map.containsKey(head)){
                map.put(head,1);
                //head 指针右移
                head = head.next;
            }else return true;
        }
        return false;
    }
}
