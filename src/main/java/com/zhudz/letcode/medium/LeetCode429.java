package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description   429. N 叉树的层序遍历
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
	val = _val;
    }

    public Node(int _val, List<Node> _children) {
	val = _val;
	children = _children;
    }
}


public class LeetCode429 {
    public List<List<Integer>> levelOrder(Node root) {
	List<List<Integer>> result = new ArrayList<>();

	Deque<Node> deque = new LinkedList<>();

	if (root != null) deque.offer(root);

	while (!deque.isEmpty()){
	    int size = deque.size();
	    ArrayList<Integer> list = new ArrayList<>();

	    while (size-- > 0){
		Node node = deque.peek();
		List<Node> children = node.children;
		for (Node n : children){
		    deque.offer(n);
		}
		list.add(node.val);
		deque.pollFirst();
	    }
	    result.add(list);
	}
	return result;
    }
}