package com.zhudz.letcode.easy;

/**
 * @Auther zhudezhong
 * @Description 125. 验证回文串
 */
public class LeetCode125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = s.toLowerCase();
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'){
                sb.append(s1.charAt(i));
            }
            else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9'){
                sb.append(s1.charAt(i));
            }
            else continue;
        }

        int i = 0;
        int j = sb.length() - 1;
        while (i < j){
            if (sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode125().isPalindrome("0P"));
    }
}