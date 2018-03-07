package com.example.algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by h on 2018/3/6.
 * 二叉树的最大深度
 */
public class Tree104 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(21);
        treeNode.left.right = new TreeNode(22);
        treeNode.right.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(7);
        Tree104 tree104 = new Tree104();
        int i = tree104.maxDepth3(treeNode);
        System.out.println(i);
    }

    public int maxDepth4(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            Integer temp = value.pop();
            max = Math.max(max, temp);
            if (node.left != null) {
                stack.push(node.left);
                value.push(temp + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                value.push(temp + 1);
            }
        }

        return max;

    }

    public int maxDepth3(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if(node.left != null) {
                stack.push(node.left);
                value.push(temp+1);
            }
            if(node.right != null) {
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
    }


    public int maxDepth2(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {

                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;

    }





    public int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }


    public int maxDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1+Math.max(maxDepth1(root.left), maxDepth1(root.right));
    }
}
