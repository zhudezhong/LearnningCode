package com.zhudz.letcode_2022.medium;


import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther zhudezhong
 * @Description  116. 填充每个节点的下一个右侧节点指针
 */

class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {}

    public Node1(int _val) {
	val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
	val = _val;
	left = _left;
	right = _right;
	next = _next;
    }
};

public class LeetCode116 {
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