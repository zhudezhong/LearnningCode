package com.zhudz.meituan;

import java.util.Scanner;

/**
 * @Auther zhudezhong ac = 100%
 * @Description 小美现在有一个序列，序列中仅包含1和-1两种数字。
 *
 *  小美现在想要知道，有多少个连续的子序列，序列中的数字乘积为正。
 *
 *  输入描述：
 *      4
 *      1 1 -1 -1
 *          第一行一个正整数n，表示小美手中的序列长度。
 *
 *          第二行n个空格隔开的数字，每个数字只能是1和-1中的一种。
 *
 *          对于80%的数据保证1 <= n <= 500
 *
 *          对于剩余20%的数据保证1 <= n <= 5000
 *
 *  输出描述：
 *      6
 *          一行一个正整数表示有多少连续的子序列满足题目要求。
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        System.out.println(countNum(nums));
    }

    public static int countNum(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int mul = nums[i];
            if (mul > 0) count++;
            for (int j = i + 1; j < nums.length; j++) {
                mul *= nums[j];
                if (mul > 0) count++;
            }
        }
        return count;
    }
}