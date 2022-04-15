package com.zhudz.letcode.easy;

import java.math.BigInteger;

/**
 * 2. 两数相加
 */
public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //进位值carry
        int carry = 0;
        ListNode head = null,tail = null;
        while (l1 != null || l2 != null){
            //链表为空的节点可以看为0
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            //链表各节点求和
            int sum = n1 + n2 + carry;

            //构建链表
            if (head == null){
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;

            //l1、l2指针右移
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        //如果进位值大于0，构建一个新的节点
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    /**
     * 获取该链表存储的非负整数
     * @param head
     * @return
     */
    public static BigInteger getListNumber(ListNode head){
        BigInteger number = BigInteger.valueOf(0);
        BigInteger count = BigInteger.valueOf(1);
        while (head != null){
            number = number.add(BigInteger.valueOf(head.val).multiply(count));
            count = count.multiply(BigInteger.valueOf(10));
            head = head.next;
        }
        System.out.println(number);
        return number;
    }

    /**
     * 使用尾插法构建链表
     * @param number
     * @return
     */
    public static ListNode setLinkList(BigInteger number){
        //头节点
        ListNode head = new ListNode();
        head.next = null;

        BigInteger value = number.mod(BigInteger.valueOf(10));
        //number /= 10;
        number = number.divide(BigInteger.valueOf(10));
        head.val = value.intValue();
        //标记链表尾部
        ListNode tail = head;

        while (number.intValue() != 0){
            //value = (int) (number % 10);
            value = number.mod(BigInteger.valueOf(10));
            //number /= 10;
            number = number.divide(BigInteger.valueOf(10));
            ListNode s = new ListNode(value.intValue());

            s.next = tail.next;
            tail.next = s;
            tail = s;
        }
        return head;
    }

}
