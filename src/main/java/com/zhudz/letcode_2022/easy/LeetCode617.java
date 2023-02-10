package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 617. 合并二叉树
 */
public class LeetCode617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	TreeNode root = new TreeNode();
	if (root1 == null) return root2;
	if (root2 == null) return root1;

	root.val = root1.val + root2.val;
	root.left = mergeTrees(root1.left, root2.left);
	root.right = mergeTrees(root1.right, root2.right);

	return root;
    }
}