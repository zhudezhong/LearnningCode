package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 剑指 Offer 05. 替换空格
 */
public class LeetCode_offer_05 {
    public static String replaceSpace(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') size += 3;
            else size++;
        }

        char[] chars = new char[size];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            }else {
                chars[j++] = s.charAt(i);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}