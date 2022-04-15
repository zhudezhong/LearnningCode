package com.zhudz.letcode.easy;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 104. 二叉树的最大深度
 */
public class LeetCode104 {

    /**
     * 1、 递归解法
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    /**
     * 2、层序遍历解法
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();

        if (root != null) deque.offer(root);

        int depth = 0;
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- > 0){
                TreeNode node = deque.peek();

                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);

                depth++;
                deque.pollFirst();
            }
        }
       return depth;
    }
}
