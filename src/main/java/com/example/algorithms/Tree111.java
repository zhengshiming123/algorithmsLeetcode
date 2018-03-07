package com.example.algorithms;

/**
 * Created by h on 2018/3/7.
 */
public class Tree111 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(21);
        treeNode.left.right = new TreeNode(22);
        treeNode.right.right = new TreeNode(6);
        Tree111 tree111 = new Tree111();
        int i = tree111.minDepth(treeNode);
        System.out.println(i);
    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;

    }
}
