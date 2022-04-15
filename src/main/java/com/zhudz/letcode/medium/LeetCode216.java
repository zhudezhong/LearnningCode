package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 216. 组合总和 III
 */
public class LeetCode216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        traceBack(n,k,1);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new LinkedList<>();
    private int sum = 0;

    private void traceBack(int n,int k,int startIndex) {
        if (sum > n) return;

        if (path.size() == k){
            if (sum == n) result.add(new ArrayList<>(path));
            sum = 0;
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            sum += i;
            path.add(i);
            traceBack(n,k,i + 1);
            sum -= i;
            path.remove(path.size() - 1);
        }
    }
}