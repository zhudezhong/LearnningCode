package com.zhudz.letcode.medium;

import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        for (String s : tokens){
            if ("+".equals(s) || "-".equals(s)
            || "*".equals(s) || "/".equals(s)){
                int i = Integer.parseInt(stack.pop());
                int j = Integer.parseInt(stack.pop());
                result = getResult(j,i,s);
                stack.push(Integer.toString(result));
            }else {
                stack.push(s);
            }
        }
        return result;
    }

    public static int getResult(int i,int j,String s){
        if ("+".equals(s)) return i + j;
        else if ("-".equals(s)) return i - j;
        else if ("*".equals(s)) return i * j;
        else return i / j;
    }
}