package com.zhudz.letcode_2022.easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 637. 二叉树的层平均值
 */
public class LeetCode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        if (root != null) deque.offer(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            Double result = 0D;
            int num = size;
            while (size-- > 0){
                TreeNode peek = deque.peek();
                result += peek.val;
                if (peek.left != null) deque.offer(peek.left);
                if (peek.right != null) deque.offer(peek.right);
                deque.pollFirst();
            }
            result /= num;
            list.add(result);
        }
        return list;
    }
}