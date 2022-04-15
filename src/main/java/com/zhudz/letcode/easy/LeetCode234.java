package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 234. 回文链表
 */
public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        //遍历链表，将链表放入栈中
        while (head != null){
            stack.push(head);
            list1.add(head.val);
            head = head.next;
        }

        int size = 0;
        while (stack.size() != 0){
            ListNode pop = stack.pop();
            if (pop.val != list1.get(size)){
                return false;
            }
            size++;
        }
        return true;
    }
}
