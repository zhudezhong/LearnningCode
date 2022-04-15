package com.zhudz.letcode.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20.有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Letcode20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.length() == 0) return false;
        Stack<Character> strs = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)){
                strs.push(s.charAt(i));
            }else {
                if (!strs.empty()) {
                    Character pop = strs.pop();
                    if (map.get(pop) != s.charAt(i)) return false;
                }else return false;
            }
        }
        return strs.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
