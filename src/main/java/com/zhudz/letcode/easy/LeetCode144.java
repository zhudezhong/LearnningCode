package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 */
public class LeetCode144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
}
