package com.example.algorithms;

/**
 * Created by h on 2018/3/5.
 */
public class Tree100 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        Tree100 tree100 = new Tree100();
        boolean sameTree = tree100.isSameTree(treeNode, treeNode);
        System.out.println(sameTree);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p==null || q==null)
            return false;
        if (p.val == q.val  ) {
            boolean sameTree1 = isSameTree(p.left, q.left);
            boolean sameTree = isSameTree(p.right, q.right);
            return sameTree1&&sameTree;
        }

        return false;
    }
}
