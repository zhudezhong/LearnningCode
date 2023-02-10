package com.zhudz.letcode_2022.easy;

import java.util.Stack;

/**
 * 344. 反转字符串
 */
public class LeetCode344 {
    /**
     * 方法一 ： 使用栈解决问题
     * 时间复杂度： O(n)
     * 空间复杂度： O(n) n为字符数组s的长度
     * @param s
     */
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        int size = stack.size();
        int j = 0;
        while (size != 0){
            s[j++] = stack.pop();
        }
    }

    /**
     * 方法二 ：    使用递归解决问题
     * @param s
     */
    public void reverseString1(char[] s) {
        if (s.length <= 0) return;
        revers(s,0,s.length - 1);
    }

    public void revers(char[] s,int left, int right){
        if (left >= right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        revers(s,++left,--right);
    }
}
