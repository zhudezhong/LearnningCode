package com.zhudz.letcode_2022.medium;

import java.util.*;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
	Arrays.sort(nums);
	boolean[] used = new boolean[nums.length];
	for (boolean b : used) {
	    b = false;
	}
	backTrack(nums,0, used);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTrack(int[] nums, int index,boolean[] used) {
	if (path.size() == nums.length) {
	    result.add(new ArrayList<>(path));
	    return;
	}

	for (int i = 0; i < nums.length; i++) {
	    if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
	    if (!used[i]) {
		//if (i > 0 && nums[i] == nums[i - 1]) continue;
		path.add(nums[i]);
		used[i] = true;
		backTrack(nums, 0,used);
		used[i] = false;
		path.removeLast();
	    }
	}
    }

    public static void main(String[] args) {
	System.out.println(new LeetCode47().permuteUnique(new int[]{1, 1, 2}));
    }
}