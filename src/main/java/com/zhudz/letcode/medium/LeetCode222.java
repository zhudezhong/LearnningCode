package com.zhudz.letcode.medium;

import com.zhudz.letcode.easy.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther zhudezhong
 * @Description 222. 完全二叉树的节点个数
 */
public class LeetCode222 {
    public int countNodes(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();

        int result = 0;
        if (root != null) deque.offer(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            result += size;

            while (size-- > 0){
                TreeNode node = deque.peek();
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
                deque.pollFirst();
            }

        }
        return result;
    }
}