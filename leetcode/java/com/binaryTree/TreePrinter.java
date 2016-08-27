package com.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树按层次打印，并存入二维数组中
 * 思路：定义两个指针一个队列
 * 一个指针last指向
 * Created by thinkpad on 2016/8/22.
 */
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode last = root;
        TreeNode lastn = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp = queue.peek();
        queue.remove(root);
        while (temp != null) {
            queue.add(root);
            //一维数组
            List<Integer> list = new ArrayList<>();
            if (temp.left != null) {
                queue.add(temp.left);
                lastn = temp.left;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                lastn = temp.right;
            }
            if (queue.peek().equals(last)) {
                System.out.println();
            }
            temp = root.left;
        }
        return null;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
