package com.zhudz.letcode_2022.easy;


/**
 * 67. 二进制求和
 */
public class Leetcode67 {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length();
        int j = b.length();
        int carry = 0;
        int n = Math.max(i,j);
        int k = 0;
        while (k++ <= n){
            carry += k < a.length() ? (a.charAt(a.length() - 1 - k) - '0') : 0;
            carry += k < b.length() ? (b.charAt(b.length() - 1 - k) - '0') : 0;
            sb.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        int a = '1' - '0';
        int b = 'c'- 'a';
        System.out.println(a+"---"+b);
    }
}
