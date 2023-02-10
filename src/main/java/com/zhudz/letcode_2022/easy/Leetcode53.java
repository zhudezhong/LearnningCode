package com.zhudz.letcode_2022.easy;

/**
 * 53.Maximum Subarray
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Leetcode53 {
    public static int maxSubArray(int[] nums){
        if (nums.length == 0) return -1;
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
