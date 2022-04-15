package com.zhudz.letcode.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther zhudezhong
 * @Description   117. 填充每个节点的下一个右侧节点指针 II
 */
public class LeetCode117 {
    public Node1 connect(Node1 root) {
	Deque<Node1> deque = new LinkedList<>();
	if (root != null) deque.offer(root);

	while (!deque.isEmpty()){

	    int size = deque.size();
	    while (size-- > 0){
		Node1 node = deque.peek();

		if (node.left != null) deque.offer(node.left);
		if (node.right != null) deque.offer(node.right);

		deque.pollFirst();
		if (size == 0) node.next = null;
		else node.next = deque.peek();
	    }
	}
	return root;
    }
}