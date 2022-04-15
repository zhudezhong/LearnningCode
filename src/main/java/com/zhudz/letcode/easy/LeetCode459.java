package com.zhudz.letcode.easy;

/**
 * @Auther zhudezhong
 * @Description 459. 重复的子字符串
 */
public class LeetCode459 {
    public int[] getNext(String s){
        int n = s.length();
        int[] next = new int[n];
        //j指向前缀末尾，i指向后缀末尾
        int j = 0;
        next[0] = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) j++;
            next[i] = j;
        }
        return next;
    }

    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNext(s);
        int n =s.length() - 1;
        if (next[n - 1] != 0 && n % (n - next[n - 1]) == 0){
            return true;
        }
        return false;
    }
}