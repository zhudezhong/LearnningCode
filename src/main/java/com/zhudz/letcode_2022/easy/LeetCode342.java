package com.zhudz.letcode_2022.easy;

/**
 * 342. 4的幂     递归
 */
public class LeetCode342 {
    public boolean isPowerOfFour(int n) {
        return recursion(n);
    }

    /**
     * 递归解法1
     * @param n
     * @return
     */
    private boolean recursion(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;

        return isPowerOfFour(n / 4);
    }
}
