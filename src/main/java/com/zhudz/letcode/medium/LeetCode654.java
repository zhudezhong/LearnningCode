package com.zhudz.letcode.medium;

import com.zhudz.letcode.easy.TreeNode;

/**
 * @Auther zhudezhong
 * @Description 654. 最大二叉树
 */
public class LeetCode654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxTreeNode(nums,0,nums.length);
    }

    public static  TreeNode maxTreeNode(int[] nums,int left,int right){
        if (left == right) return null;
        //找到nums 数组 最大值的索引
        int maxIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }

        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = maxTreeNode(nums,left,maxIndex);
        root.right = maxTreeNode(nums,maxIndex + 1,right);

        return root;
    }
}