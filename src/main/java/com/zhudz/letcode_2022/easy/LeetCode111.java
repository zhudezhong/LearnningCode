package com.zhudz.letcode_2022.easy;

/**
 * 111. 二叉树的最小深度
 */
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return left > right ? right : left;
    }

    public static int getDepth(TreeNode root){
        if (root == null) return 0;
        return Math.max(getDepth(root.left),getDepth(root.right)) + 1;
    }
}
