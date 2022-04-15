package com.zhudz.letcode.medium;


import com.zhudz.letcode.easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        midOrder(root);
        return list.get(k - 1);
    }

    public TreeNode midOrder(TreeNode root){
        if (root != null){
            midOrder(root.left);
            list.add(root.val);
            midOrder(root.right);
        }
        return null;
    }
}
