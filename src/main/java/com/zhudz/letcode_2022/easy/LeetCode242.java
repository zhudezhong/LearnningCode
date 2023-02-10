package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description  242. 有效的字母异位词
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] nums = new int[26];

        for(int i = 0; i < s.length(); i++){
            nums[s.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < t.length(); i++){
            nums[t.charAt(i) - 'a'] --;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) return false;
        }
        return true;
    }
}