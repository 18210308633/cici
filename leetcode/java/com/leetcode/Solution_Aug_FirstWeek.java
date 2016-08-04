package com.leetcode;

/**
 * Created by rensong.pu on 2016/8/3.
 */
public class Solution_Aug_FirstWeek {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }


    }

    /**
     * 98. Validate Binary Search Tree
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }

        if (null != root.left && root.val <= root.left.val) {
            return false;
        }
        if (null != root.right && root.val >= root.right.val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
//        TreeNode leftNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(4);
//        treeNode.left = leftNode;
        treeNode.right = rightNode;
        System.out.println(isValidBST(treeNode));
    }

}
