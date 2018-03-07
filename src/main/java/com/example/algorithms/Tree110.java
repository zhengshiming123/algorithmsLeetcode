package com.example.algorithms;

/**
 * Created by h on 2018/3/7.
 * 平衡二叉树
 */
public class Tree110 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(21);
        treeNode.left.right = new TreeNode(22);
        treeNode.right.right = new TreeNode(6);
        Tree110 tree110 = new Tree110();
        boolean balanced = tree110.isBalanced(treeNode);
        System.out.println(balanced);
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root)!=-1;

    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lH=height(node.left);
        if(lH==-1){
            return -1;
        }
        int rH=height(node.right);
        if(rH==-1){
            return -1;
        }
        if(lH-rH<-1 || lH-rH>1){
            return -1;
        }
        return Math.max(lH,rH)+1;
    }
}
