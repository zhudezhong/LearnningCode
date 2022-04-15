package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class LeetCode145 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
