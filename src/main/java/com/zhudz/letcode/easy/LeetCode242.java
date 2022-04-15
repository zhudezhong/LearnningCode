package com.zhudz.letcode.easy;

/**
 * @Auther zhudezhong
 * @Description  242. 有效的字母异位词
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] nums = new int[26];
        int[] numt = new int[26];

        for(int i = 0; i < s.length(); i++){
            nums[s.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < t.length(); i++){
            numt[t.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != numt[i]) return false;
        }
        return true;
    }
}