package com.zhudz.letcode.easy;

import java.util.Stack;

/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int flag = 0;
        ListNode cur = head;
        Stack<ListNode> stack = new Stack();
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }

        while (!stack.isEmpty()){
            ListNode pop = stack.pop();
            flag++;
            if (flag == n){
                ListNode next = pop.next;
                //栈顶元素出栈后，栈中还有元素
                if (stack.size() != 0){
                    ListNode prev = stack.peek();
                    prev.next = next;
                    pop.next = null;
                }
                //栈中没有元素说明要删除的节点是头节点
                else {
                    head = head.next;
                }
            }
        }

        return head;
    }
}
