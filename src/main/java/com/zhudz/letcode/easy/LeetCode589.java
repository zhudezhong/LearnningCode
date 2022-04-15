package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description
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

public class LeetCode589 {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
	if (root != null){
	    list.add(root.val);
	    List<Node> children = root.children;
	    for (Node n : children){
		preorder(n);
	    }
	}
	return list;
    }
}