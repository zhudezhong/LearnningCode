package com.zhudz.shoppe;

/**
 * @Auther zhudezhong
 * @Description  五进制数组转整数
 * 给定一个整形数组，此数组是一个整数数字的五进制表示形式，数组中每个元素的值都小于等于4
 *
 * 请你返回该数组所表示数字的 十进制值 。
 *
 */
public class Code2 {
    public long Convert(int[] nums) {
        // write code here
        long result = 0;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            result += nums[i] * Math.pow(5,count++);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Code2().Convert(new int[]{4, 3, 1}));
    }
}