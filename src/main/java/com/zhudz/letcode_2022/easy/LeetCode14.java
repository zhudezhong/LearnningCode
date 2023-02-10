package com.zhudz.letcode_2022.easy;

/**
 *  14. 最长公共前缀
 */
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) return strs[0];
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestPrefix(prefix,strs[i]);
            //如果前缀prefix长度等于0，说明没有公共前缀，直接返回空字符串
            if (prefix.length() == 0){
                return prefix;
            }
        }
        return prefix;
    }

    public static String longestPrefix(String s1,String s2){
        int len = Math.min(s1.length(),s2.length());
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (i < len){
            if (s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i++));
            }else break;
        }
        return sb.toString();
    }
}
