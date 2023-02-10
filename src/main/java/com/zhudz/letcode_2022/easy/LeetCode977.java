package com.zhudz.letcode_2022.easy;

/**
 * 977. 有序数组的平方
 */
public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
	int low = 0, high = nums.length - 1;
	int[] result = new int[nums.length];
	int pos = nums.length - 1;
	while (low <= high) {
	    while (low <= high && nums[low] * nums[low] >= nums[high] * nums[high]) {
		result[pos--] = nums[low] * nums[low];
		low++;
	    }

	    while (low <= high && nums[low] * nums[low] < nums[high] * nums[high]) {
		result[pos--] = nums[high] * nums[high];
		high--;
	    }
	}

	return result;
    }
}
