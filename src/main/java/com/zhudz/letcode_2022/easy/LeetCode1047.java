package com.zhudz.letcode_2022.easy;

import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description 1047. 删除字符串中的所有相邻重复项
 */
public class LeetCode1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stackIn = new Stack<>();
        int i = 1;
        if (s.length() < 1) return "";

        Character peek = stackIn.push(s.charAt(0));
        while (i < s.length()) {
            if (!stackIn.isEmpty()) {
                peek = stackIn.peek();
                if (peek != s.charAt(i)) {
                    stackIn.push(s.charAt(i));
                } else {
                    stackIn.pop();
                }
            }else {
                stackIn.push(s.charAt(i));
            }
            i++;
        }
        StringBuffer sb = new StringBuffer();
        while (!stackIn.isEmpty()){
            sb.append(stackIn.pop());
        }

        return sb.reverse().toString();
    }


}