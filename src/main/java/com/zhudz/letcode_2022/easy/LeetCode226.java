package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)  return root;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}