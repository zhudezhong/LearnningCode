package com.zhudz.letcode_2022.medium;

import com.zhudz.letcode_2022.easy.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description  199. 二叉树的右视图
 */
public class LeetCode199 {
    public List<Integer> rightSideView(TreeNode root) {
	ArrayList<Integer> list = new ArrayList<>();

	Deque<TreeNode> deque = new LinkedList<>();
	if (root != null) deque.offer(root);

	while (!deque.isEmpty()){
	    int size = deque.size();

	    while (size-- > 0){
		TreeNode node = deque.peekFirst();

		if (node.left != null) deque.offer(node.left);
		if (node.right != null) deque.offer(node.right);

		if (size == 0) list.add(node.val);

		deque.pollFirst();
	    }
	}
	return list;
    }
}