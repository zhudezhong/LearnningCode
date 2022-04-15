package com.zhudz.letcode.medium;

import com.zhudz.letcode.easy.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description  102. 二叉树的层序遍历
 */
public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
	return result;
    }
}