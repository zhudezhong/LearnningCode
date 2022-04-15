package com.zhudz.letcode.medium;

import com.zhudz.letcode.easy.TreeNode;

/**
 * @Auther zhudezhong
 * @Description 98. 验证二叉搜索树
 */
public class LeetCode98 {
    TreeNode max;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        boolean left = isValidBST(root.left);
        if (!left) return false;
        if (max != null && max.val >= root.val)
            return false;
        max = root;

        boolean right = isValidBST(root.right);
        return right;
    }
}