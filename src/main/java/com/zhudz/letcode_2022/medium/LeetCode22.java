package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode22 {
    public static List<String> generateParenthesis(int n) {
        result.clear();
        backTracking(n,0);
        return result;
    }

    private static List<String> result = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    private static char[] c = new char[]{'(',')'};

    private static void backTracking(int n,int index) {
        if (index == 2 * n){
            if (isValid(sb.toString()))
                result.add(sb.toString());
            return;
        }

        for (int i = index; i < 2 * n; i++) {
            for (int j = 0; j < c.length; j++) {
                sb.append(c[j]);
                backTracking(n,i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }

        }
    }

    private static boolean isValid(String s){
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        System.out.println(isValid("((()))"));
        System.out.println(generateParenthesis(3));
    }
}