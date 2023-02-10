package com.zhudz.letcode_2022.easy;

/**
 * 509. 斐波那契数
 */
public class LeetCode509 {
    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        return fib(n - 1) * fib(n - 2);
    }
}
