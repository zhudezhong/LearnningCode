package com.zhudz.letcode_2022.easy;

import java.util.ArrayList;

/**
 * @Auther zhudezhong
 * @Description	530. 二叉搜索树的最小绝对差
 */
public class LeetCode530 {
    private int min = Integer.MAX_VALUE;
    private TreeNode pre;

    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
	dfs(root);
	return min;
    }

    private void dfs(TreeNode root){
	if (root == null) return;
	if (root != null){
	    dfs(root.left);
	    if (pre != null){
		min = Math.min(min,root.val - pre.val);
	    }
	    pre = root;
	    dfs(root.right);
	}
    }


    private ArrayList<Integer> list = new ArrayList<>();

    /**
     * 方法二：二叉搜索树的中序遍历是一个有序数组集合
     * @param root
     * @return
     */
    public int getMinimumDifference1(TreeNode root){
	dfs1(root);
	for (int i = 1; i < list.size(); i++) {
	    min = Math.min(min,list.get(i) - list.get(i - 1));
	}
	return min;
    }

    private void dfs1(TreeNode root){
	if (root != null){
	    dfs1(root.left);
	    list.add(root.val);
	    dfs1(root.right);
	}
    }
}