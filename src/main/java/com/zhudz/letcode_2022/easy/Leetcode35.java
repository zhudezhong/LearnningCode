package com.zhudz.letcode_2022.easy;

/**
 * 35.搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Leetcode35 {
    /**
     * 方法一： 暴力遍历
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == target) return i;
	    if (nums[i] > target) return i;
	}
	return nums.length;
    }

    /**
     * 方法二： 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
	int low = 0, high = nums.length - 1;
	while (low <= high) {
	    int mid = low + (high - low) / 2;
	    if (nums[mid] == target) return mid;
            if (nums[mid] > target) high = mid - 1;
	    else low = mid + 1;
	}
	return low;
    }

    public static void main(String[] args) {
	int[] nums = new int[]{1, 3, 5, 6};
	System.out.println(searchInsert(nums, 7));
    }
}
