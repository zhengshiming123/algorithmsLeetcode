package com.example.algorithms;

/**
 * Created by h on 2018/3/7.
 */
public class Tree112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
