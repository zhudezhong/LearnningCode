package com.zhudz.letcode_2022.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther zhudezhong
 * @Description 501. 二叉搜索树中的众数
 */
public class LeetCode501 {
    public int[] findMode(TreeNode root) {
	dfs(root);
	Set<Integer> keys = map.keySet();
	int max = 0;
	Set<Integer> res = new HashSet<>();
	for (int k : keys){
	    if (map.get(k) >= max) {
		max = map.get(k);
		res.add(k);
	    }
	}
	int[] num = new int[res.size()];
	int index = 0;
	for (int i : res){
	    num[index++] = i;
	}
	return num;
    }
    private HashMap<Integer,Integer> map = new HashMap<>();
    private void dfs(TreeNode root){
	if (root != null){
	    dfs(root.left);
	    map.put(root.val, map.getOrDefault(root.val,0) + 1);
	    dfs(root.right);
	}
    }
}