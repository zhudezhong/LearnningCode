package com.zhudz.letcode.medium;

import com.zhudz.letcode.easy.TreeNode;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return buildNode(inorder,0,inorder.length,
                postorder,0,postorder.length);
    }

    public static TreeNode buildNode(int[] inorder,int instart,int inend,
                                     int[] postorder,int poststart,int postend){
        //没有元素了
        if (inend - instart < 1)
            return null;
        //只有一个元素了
        if (inend - instart == 1)
            return new TreeNode(inorder[instart]);

        //后序数组postorder里最后一个即为根节点
        int rootVal = postorder[postend - 1];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        //根据更节点的值找到该值在中序数组inorder中的位置
        for (int i = instart; i < inend; i++){
            if (inorder[i] == rootVal){
                rootIndex = i;
                break;
            }
        }

        //根据rootIndex划分左右子树
        root.left = buildNode(inorder,instart,rootIndex,
                postorder,poststart,poststart + (rootIndex - instart));
        root.right = buildNode(inorder,rootIndex + 1,inend,
                postorder,poststart + (rootIndex - instart),postend - 1);

        return root;
    }
}