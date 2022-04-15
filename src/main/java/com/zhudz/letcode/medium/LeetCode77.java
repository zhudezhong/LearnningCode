package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 77. 组合
 */
public class LeetCode77 {

    public List<List<Integer>> combine(int n, int k) {
	traceBack(n, k, 1);
	return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    private void traceBack(int n, int k, int startIndex) {
	if (path.size() == k) {
	    result.add(new ArrayList<>(path));
	    return;
	}

	for (int i = startIndex; i <= n - (k - path.size()); i++) {
	    path.add(i);
	    traceBack(n, k, i + 1);
	    path.remove(path.size() - 1);
	}
    }

    public static void main(String[] args) {
	new LeetCode77().combine(4,2);
    }
}