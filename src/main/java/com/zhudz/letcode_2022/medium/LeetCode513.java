package com.zhudz.letcode_2022.medium;

import com.zhudz.letcode_2022.easy.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther zhudezhong
 * @Description 513. 找树左下角的值
 */
public class LeetCode513 {
    /**
     * 1、 使用层序遍历
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
	Deque<TreeNode> deque = new LinkedList<>();

	if (root != null) deque.offer(root);
	else return 0;

	TreeNode result = deque.peek();
	while (!deque.isEmpty()){
	    int size = deque.size();
	    result = deque.peek();

	    while (size-- > 0){
		TreeNode node = deque.peek();
		if (node.left != null) deque.offer(node.left);
		if (node.right != null) deque.offer(node.right);
		deque.pollFirst();
	    }
	    if (deque.isEmpty()) return result.val;
	}
	return result.val;
    }


}