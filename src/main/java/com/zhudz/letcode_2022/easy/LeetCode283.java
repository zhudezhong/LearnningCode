package com.zhudz.letcode_2022.easy;

/**
 * 283. 移动零
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n < 2) return;

        int left = 0;
        int right = 1;
        while (right < n){
            if (nums[left] == 0 && nums[right] != 0){
                nums[left++] = nums[right];
                nums[right++] = 0;
            }
            else if (nums[left] != 0 && nums[right] == 0){
                right++;
                left++;
            }
            else if (nums[left] == 0 && nums[right] == 0){
                right++;
            }
            else if (nums[left] != 0 && nums[right] != 0){
                right++;
                left++;
            }
        }
    }
}
