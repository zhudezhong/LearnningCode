package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description 151. 颠倒字符串中的单词
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        ArrayList<String> strs = new ArrayList<>();

        for (int i = s.length() - 1; i >= 0;) {
            int j = i;
            while (s.charAt(j) == ' ' && j >= 0) j--;

            i = j;
            while (s.charAt(i) != ' ' && i >= 0) i--;

            if (i != j) strs.add(s.substring(i + 1,j + 1));
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i));
            if (i != strs.size() - 1) sb.append(" ");
        }

        return sb.toString();
    }
}