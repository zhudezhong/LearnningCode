package com.zhudz.letcode_2022.easy;

/**
 * 704. 二分查找
 */
public class LeetCode704 {
    /**
     * 二分查找
     * 事件复杂度： O(log n)  n为数组长度
     * 空间复杂度： O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
	int low = 0, high = nums.length - 1;
	while (low <= high) {
	    int mid = low + (high - low) / 2;
	    if (nums[mid] == target) return mid;
	    if (nums[mid] > target){
		high = mid - 1;
	    }
	    else low = mid + 1;
	}
	return -1;
    }
}
