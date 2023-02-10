package com.zhudz.letcode_2022.easy;

import java.util.HashSet;

/**
 * @Auther zhudezhong
 * @Description 202. 快乐数
 */
public class LeetCode202 {
    public boolean isHappy(int n) {
	HashSet<Integer> res = new HashSet<>();
	while (!res.contains(n)) {
	    res.add(n);
	    n = getSum(n);
	    if (n == 1) return true;
	}
	return false;
    }

    /**
     * 求 n 各个位置的平方和
     *
     * @param n
     * @return
     */
    public int getSum(int n) {
	int sum = 0;
	while (n != 0) {
	    int num = n % 10;
	    sum += num * num;
	    n /= 10;
	}
	return sum;
    }
}