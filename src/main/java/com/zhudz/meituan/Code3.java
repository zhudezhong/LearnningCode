package com.zhudz.meituan;

import java.util.Scanner;

/**
 * @Auther zhudezhong
 * @Description  ac = 54%
 * 小美现在在厨房做饭。小美发现食材现在只够每种菜做一份。
 *
 * 现在同一时刻（即不分先后顺序）来了n个顾客。每个顾客都有想两份要点的菜。只有当顾客吃到全部自己想要的菜的时候，顾客才会满意。
 *
 * 现在你的任务是，合理地接取顾客的订单要求，尽可能让更多的顾客满意，并输出最多有多少顾客可以满意。
 *
 * 输入描述：
 *      第一行两个正整数n, m
 *
 *      n表明有多少顾客前来点菜，m表示小美现在能做的菜的编号范围在[1, m]。
 *
 *      接下来n行，每行两个数字，表明一名顾客的所点的两道菜的编号。
 *
 *      其中80%的数据保证2 <= n <= 10, 2 <= m <= 20
 *
 *      另外20%的数据保证2 <= n <= 20, 2 <= m <= 40
 * case：3 4
 *      1 2
 *      2 3
 *      3 4
 * 输出描述：
 *      一行一个正整数表示最多有多少顾客可以满意。
 *  result： 2
 */
public class Code3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = sc.nextInt();
        int[] nums = new int[m];
        //表示每种菜只能做一份
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }

        int result = 0;
        while (n-- > 0){
            int first = Integer.parseInt(sc.next());
            int second = sc.nextInt();

            if (order(nums,first - 1,second - 1)) result++;
        }

        System.out.println(result);
    }

    //判断顾客是否满意
    public static boolean order(int[] nums,int first,int second) throws Exception {
        if (nums.length <= first || nums.length <= second)
            throw new Exception("没有这一项菜，请重新输入");
        if (nums[first] == 1 && nums[second] == 1){
            nums[first]--;
            nums[second]--;
            return true;
        }

        return false;
    }
}