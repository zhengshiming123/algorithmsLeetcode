package com.example.algorithms;

/**
 * Created by h on 2018/3/6.
 */
public class Tree108 {

    public static void main(String[] args) {
        Tree108 tree108 = new Tree108();
        TreeNode treeNode1 = tree108.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(treeNode1);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int low = 0, height = 0;
        TreeNode node = node(nums, low, nums.length-1);
        return node;
    }

    public TreeNode node(int[] nums,int low ,int height) {

        if (low > height) {
            return null;
        }
        int mid = (low + height) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = node(nums, low, mid - 1);
        treeNode.right = node(nums, mid + 1, height);

        return treeNode;

    }
}
