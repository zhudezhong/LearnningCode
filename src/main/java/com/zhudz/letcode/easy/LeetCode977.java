package com.zhudz.letcode.easy;

/**
 * 977. 有序数组的平方
 */
public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        }

        int right = 1;
        int left = 0;
        int n = nums.length;
        //int[] arr = new int[n];

        nums[0] = nums[0] * nums[0];
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] * nums[i];

            //插入排序
            if (nums[i] < nums[i - 1]){
                int tmp = nums[i];
                int j = i;
                for (; j > 0 && nums[j] < nums[j - 1]; j--) {
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
        return nums;
    }
}
