package com.zhudz.letcode.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description   112. 路径总和
 */
public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
	HashSet<Integer> result = new HashSet<>();
	if (root == null) return false;
	LinkedList<TreeNode> paths = new LinkedList<>();
	dfs(root,paths,result);
	return result.contains(targetSum);
    }

    public static void dfs(TreeNode root, List<TreeNode> path,HashSet<Integer> result){
	path.add(root);

	if (root.left == null && root.right == null){
	    int sum = 0;
	    for (TreeNode node : path){
		sum += node.val;
	    }
	    result.add(sum);
	    return;
	}

	if (root.left != null){
	    dfs(root.left,path,result);
	    path.remove(path.size() - 1);
	}
	if (root.right != null){
	    dfs(root.right,path,result);
	    path.remove(path.size() - 1);
	}
    }
}