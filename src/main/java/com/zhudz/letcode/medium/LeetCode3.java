package com.zhudz.letcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();

        int j = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            //在map移除s前一个字符
            if (i != 0){
                map.remove(s.charAt(i - 1));
            }

            while (j < s.length() - 1 && !map.contains(s.charAt(j + 1))){
                map.add(s.charAt(j + 1));
                j++;
            }
            ans = Math.max(ans,j - i + 1);
        }
        return ans;
    }
}
