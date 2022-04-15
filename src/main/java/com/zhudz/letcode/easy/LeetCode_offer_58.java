package com.zhudz.letcode.easy;

/**
 * @Auther zhudezhong
 * @Description  剑指 Offer 58 - II. 左旋转字符串
 */
public class LeetCode_offer_58 {
    public String reverseLeftWords(String s, int n) {
        if (n == s.length()) return s;

        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i++ < n){
            char tmp = chars[0];
            for (int k = 1; k < chars.length; k++) {
                chars[k - 1] = chars[k];
            }
            chars[j] = tmp;
        }
        return new String(chars);
    }
}