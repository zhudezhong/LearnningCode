package com.zhudz.meituan;

import java.util.Scanner;

/**
 * @Auther zhudezhong  ac = 100%
 * @Description小美现在相信一些数字能给他带来好运。
 *
 * 这些数字至少满足以下两个特征中的一种：
 *
 * 1. 数字是11的整数倍。
 *
 * 2. 数字中至少包含两个1。
 *
 * 小美现在给你若干数字，希望你回答这个数字是不是幸运数。
 *
 *
 *
 * 例如：132是11的12倍，满足条件1，101有两个1，满足条件2。
 *
 * 输入描述：第一行一个数字n，表示小美有n组询问
 *
 * 接下来每一行一个正整数表示小美询问的数字。
 *
 * 数据保证1 <= n <= 500, 每个询问的数字在 [1, 1e9]范围内
 *
 * 输出描述：
 * 对于每组询问，如果是幸运数，输出yes，不是，输出no。
 *
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(luckyNumber(number));
        }
    }

    public static String luckyNumber(int num){
        if (num % 11 == 0) return "yes";
        String s = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                count++;
            }
            if (count >= 2) return "yes";
        }
        return "no";
    }
}