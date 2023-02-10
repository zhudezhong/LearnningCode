package com.zhudz.letcode_2022.easy;

/**
 * LC:删除排序数组中的重复项
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int right = 1;
        int left = right - 1;
        while (right < nums.length){

            if (nums[right] == nums[left]) {
                right++;
                continue;
            }else {
                //left++;
                nums[++left] = nums[right++];
                //right++;
            }
        }

        return left+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,3};
        System.out.println(removeDuplicates(nums));
    }
}
