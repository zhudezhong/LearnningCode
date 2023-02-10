package com.zhudz.letcode_2022.easy;

/**
 * 231. 2 的幂       递归类型题目
 */
public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        //base case
        if (n == 1) return true;
        if (n == 0) return false;
        if (n % 2 != 0) return false;
        //recursion relation
        return isPowerOfTwo(n / 2);
    }
}
