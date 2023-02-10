package com.zhudz.letcode_2022.easy;

/**
 * 58. 最后一个单词的长度
 */
public class Leetcode58 {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean flag = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ' && flag) {
                continue;
            }
            else {
                flag = false;
                if (c != ' ') length++;
                else break ;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
