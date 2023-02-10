package com.zhudz.letcode_2022.easy;

/**
 * 100. 相同的树
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null){
            if (p.val != q.val) return false;
            else return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        if (p == null && q == null) return true;
        return false;
    }
}
