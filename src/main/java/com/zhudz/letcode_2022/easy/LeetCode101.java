package com.zhudz.letcode_2022.easy;

/**
 * 101. 对称二叉树
 * 该问题可以转化为：两个树在什么情况下互为镜像？
 *
 * 如果同时满足下面的条件，两个树互为镜像：
 *      1.它们的两个根结点具有相同的值
 *      2.每个树的右子树都与另一个树的左子树镜像对称
 * 我们可以实现这样一个递归函数，通过「同步移动」两个指针的方法来遍历这棵树，
 * pp 指针和 qq 指针一开始都指向这棵树的根，随后 pp 右移时，qq 左移，pp 左移时，qq 右移
 * 。每次检查当前 pp 和 qq 节点的值是否相等，如果相等再判断左右子树是否对称。
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
//        if (root != null){
//            return check(root,root);
//        }else return true;
        return check(root,root);
    }

    public static boolean check(TreeNode l,TreeNode r){
        if (l != null && r != null){
            if (l.val != r.val) return false;
            else return check(l.left,r.right) && check(l.right,r.left);
        }
        if (l == null && r == null) return true;
        return false;
    }
}
