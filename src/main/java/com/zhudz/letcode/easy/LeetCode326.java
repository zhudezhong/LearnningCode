package com.zhudz.letcode.easy;

/**
 * 326. 3 的幂    递归！！！
 */
public class LeetCode326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 3 != 0) return false;

        return isPowerOfThree(n / 3);
    }
}
