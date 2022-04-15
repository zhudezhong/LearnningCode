package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 590. N 叉树的后序遍历
 */
public class LeetCode590 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root != null){
            List<Node> children = root.children;
            for (Node n : children){
                postorder(n);
            }
            list.add(root.val);
        }
        return list;
    }
}