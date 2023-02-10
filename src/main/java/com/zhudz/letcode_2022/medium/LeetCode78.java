package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 78. 子集
 */
public class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
	backTracking(nums, 0);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTracking(int[] nums, int index) {
	result.add(new ArrayList<>(path));
	if (index == nums.length) {
	    return;
	}

	for (int i = index; i < nums.length; i++) {
	    path.add(nums[i]);
	    backTracking(nums, i + 1);
	    path.removeLast();
	}
    }
}