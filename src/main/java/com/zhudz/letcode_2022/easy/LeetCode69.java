package com.zhudz.letcode_2022.easy;

/**
 * 69. x 的平方根
 */
public class LeetCode69 {
    public int mySqrt(int x) throws Exception {
        if (x < 0) throw new Exception("请传入一个非负整数参数！！！");
        return 1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new LeetCode69().mySqrt(-1));
    }
}
