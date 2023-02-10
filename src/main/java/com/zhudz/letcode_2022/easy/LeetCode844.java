package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 844. 比较含退格的字符串
 */
public class LeetCode844 {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 && j >= 0){
            //找到第一个不是#的字符
            while (i > 0 && s.charAt(i) == '#'){
                if (s.charAt(i - 1) == '#'){
                    i -= 4;
                    continue;
                }
                i -= 2;
            }

            while (j > 0 && t.charAt(j) == '#'){
                if (s.charAt(j - 1) == '#'){
                    j -= 4;
                    continue;
                }
                j -= 2;
            }

            if (i < 0 && j < 0) {
                return true;
            }
            if (s.charAt(i) == t.charAt(j)){
                i--;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

}