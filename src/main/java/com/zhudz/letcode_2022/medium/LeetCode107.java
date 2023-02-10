package com.zhudz.letcode_2022.medium;

import com.zhudz.letcode_2022.easy.TreeNode;

import java.util.*;

/**
* @Auther  zhudezhong
* @Description  107. 二叉树的层序遍历 II
*/
public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return  result;
        deque.offer(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < size;i++){
                TreeNode node = deque.peek();
                list.add(node.val);

                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);

                deque.pollFirst();
            }
            result.add(list);
        }
        Collections.reverse(result);

        return result;
    }
}