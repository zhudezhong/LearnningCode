package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 219. 存在重复元素 II
 */
public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
	int slow = 0;
	int fast = 1;
	while (fast < nums.length) {
	    if (nums[fast] == nums[slow]) {
                if (fast - slow <= k) return true;
	    }else {
		fast++;
	    }
	}
	return false;
    }
}