package com.zhudz.letcode_2022.medium;

import com.zhudz.letcode_2022.easy.TreeNode;

import java.util.*;

/**
 * @Auther zhudezhong
 * @Description   515. 在每个树行中找最大值
 */
public class LeetCode515 {
    public List<Integer> largestValues(TreeNode root) {
	Deque<TreeNode> deque = new LinkedList<>();

	List<Integer> result = new ArrayList<>();
	if (root == null) return  result;
	deque.offer(root);

	while (!deque.isEmpty()){
	    int size = deque.size();

	    int max = Integer.MIN_VALUE;
	    while (size-- > 0){
		TreeNode node = deque.peek();
		if (node.val > max) max = node.val;
		if (node.left != null) deque.offer(node.left);
		if (node.right != null) deque.offer(node.right);
		deque.pollFirst();
	    }
	    result.add(max);
	}

	return result;
    }
}