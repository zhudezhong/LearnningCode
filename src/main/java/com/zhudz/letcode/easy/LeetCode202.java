package com.zhudz.letcode.easy;

import java.util.HashSet;

/**
 * @Auther zhudezhong
 * @Description 202. 快乐数
 */
public class LeetCode202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int res = getSum(n);
        while (true){

            if (res == 1) return true;
            if (set.contains(res)){
                return false;
            }else {
                set.add(res);
            }
            res = getSum(res);
        }
    }

    /**
     * 求 n 各个位置的平方和
     * @param n
     * @return
     */
    public int getSum(int n){
        int temp = 0;
        int sum = 0;
        while (n != 0){
            temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}