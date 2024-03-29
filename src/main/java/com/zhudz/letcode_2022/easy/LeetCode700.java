package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 700. 二叉搜索树中的搜索
 */
public class LeetCode700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) return searchBST(root.right,val);
        else return searchBST(root.left,val);
    }
}