package com.zhudz.letcode_2022.easy;

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
