package com.zhudz.letcode_2022.easy;

public class Solution {
        /**
         * 是否归一数字
         * @param n int整型 数字
         * @return bool布尔型
         */
        public static boolean isHappy (int n) {
            // write code here
            if(n <= 0) return false;
            int res = 0;
            while(n != 0){
                int x = n % 10;
                res = res + x * x;
                n /= 10;
            }
            if(res == 1) return true;
            else  return isHappy(res);
        }

    public static void main(String[] args) {
        System.out.println(isHappy(Integer.MAX_VALUE));
    }
}
