package com.zhudz.letcode_2022.easy;

import java.util.*;

/**
 * @Auther zhudezhong
 * @Description 257. 二叉树的所有路径
 */
public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if (root == null) return result;

        LinkedList<Integer> path = new LinkedList<>();
        dfs(root,path,result);
        return result;
    }

    public static void dfs(TreeNode root,LinkedList<Integer> path,List<String> result){
        path.add(root.val);
        //找到了叶子节点
        if (root.left == null && root.right == null){

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }

            sb.append(path.get(path.size() - 1));
            result.add(sb.toString());
            return;
        }

        if (root.left != null){
            dfs(root.left,path,result);
            path.remove(path.size() - 1);
        }

        if (root.right != null){
            dfs(root.left,path,result);
            path.remove(path.size() - 1);
        }
    }

}