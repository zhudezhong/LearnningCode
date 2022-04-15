package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 39. 组合总和
 */
public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	Arrays.sort(candidates);
	backTracking(candidates, target, 0,0);
	return result;
    }


    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTracking(int[] candidates, int target, int sum,int index) {
	if (sum > target) return;

	if (sum == target) {
	    result.add(new ArrayList<>(path));
	    return;
	}

	for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
	    path.add(candidates[i]);
	    sum += candidates[i];
	    backTracking(candidates, target, sum,i);
	    sum -= candidates[i];
	    path.removeLast();
	}
    }
}