package com.zhudz.letcode.easy;

import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 */
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
