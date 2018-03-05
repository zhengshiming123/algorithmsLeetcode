package com.example.algorithms;

/**
 * Created by h on 2018/3/5.
 */
public class Math101 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(12);
        treeNode.right.right = new TreeNode(12);
        Math101 math101 = new Math101();
        boolean symmetric = math101.isSymmetric(treeNode);
        System.out.println(symmetric);

    }
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        boolean symmetricNode = isSymmetricNode(root.left, root.right);
        return symmetricNode;

    }

    public boolean isSymmetricNode(TreeNode left,TreeNode rigth) {

        if (left == null || rigth == null) {
            return left == rigth;
        }
        if (left.val != rigth.val) {
            return false;
        }
        boolean symmetricNode = isSymmetricNode(left.left, rigth.right);
        boolean symmetricNode1 = isSymmetricNode(left.right, rigth.left);
        return symmetricNode && symmetricNode1;

    }
}
