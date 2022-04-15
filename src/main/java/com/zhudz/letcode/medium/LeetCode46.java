package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 46. 全排列
 */
public class LeetCode46 {
    public List<List<Integer>> permute(int[] nums) {
	boolean[] used = new boolean[nums.length];
	for (boolean b : used) {
	    b = false;
	}
	backTrack(nums, used);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTrack(int[] nums, boolean[] used) {
	if (path.size() == nums.length) {
	    result.add(new ArrayList<>(path));
	    return;
	}

	for (int i = 0; i < nums.length; i++) {
	    if (!used[i]) {
		path.add(nums[i]);
		used[i] = true;
		backTrack(nums, used);
		used[i] = false;
		path.removeLast();
	    }
	}
    }

    public static void main(String[] args) {
	System.out.println(new LeetCode46().permute(new int[]{1, 2, 3}));
    }
}