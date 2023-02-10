package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 40. 组合总和 II
 */
public class LeetCode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	Arrays.sort(candidates);
	backTrace(candidates, target, 0, 0);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTrace(int[] candidates, int target, int sum, int index) {
	if (sum > target) {
	    return;
	}

	if (sum == target) {
	    result.add(new ArrayList<>(path));
	    return;
	}

	for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
	    if (i > index && candidates[i] == candidates[i - 1]) continue;
	    sum += candidates[i];
	    path.add(candidates[i]);
	    backTrace(candidates, target, sum, i + 1);
	    sum -= candidates[i];
	    path.removeLast();
	}
    }
}