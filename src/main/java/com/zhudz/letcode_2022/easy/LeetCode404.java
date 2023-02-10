package com.zhudz.letcode_2022.easy;

/**
 * @Auther zhudezhong
 * @Description 404. 左叶子之和
 */
public class LeetCode404 {

    public int sumOfLeftLeaves(TreeNode root) {
	if (root == null) return 0;


        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        int result = 0;
        if (root.left != null && root.left.left == null
                    && root.left.right == null)
            result += root.left.val;

        return result+ left + right;
    }


}