package com.zhudz.letcode.easy;

/**
 * 35.搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Leetcode35 {
    /**
     * 方法一： 暴力遍历
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return i;
        }
        return nums.length;
    }

    /**
     * 方法二： 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums,int target){
        int length = nums.length;
        int low = 0;
        int hight = length - 1;
        int mid;
        int ans = length;
        while (low <= hight){
            mid = low + (hight - low) / 2;

            if (nums[mid] < target){
                low = mid + 1;
            }

            if (nums[mid] >= target){
                ans = mid;
                hight = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
}
