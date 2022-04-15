package com.zhudz.letcode.easy;

/**
 * 28. 实现 strStr()
 * 考点：  KMP算法
 */
public class LeetCode28 {
    /**
     * 暴力遍历算法
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int i = 0,j = 0;
        while (i < haystack.length() && j < needle.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                i = i - j + 2;
                j = 0;
            }
        }
        if (j > needle.length() - 1) return i - needle.length();
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issi"));
    }
}
