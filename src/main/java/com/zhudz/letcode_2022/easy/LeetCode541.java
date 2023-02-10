package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 541. 反转字符串 II
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        String res = null;
        if (true) {
            int i = 0;
            String strs = s.substring(i, 2 * k + 1);
            res = reverse(strs, k);

        }
        return null;
    }

    public static String reverse(String s,int k){
        int length = s.length();
        if (length < k) {
            return new StringBuffer(s).reverse().toString();
        }
        return new StringBuffer(s.substring(0,2 * k + 1)).reverse()
                .append(s.substring(2 * k + 1,length)).toString();
    }

}