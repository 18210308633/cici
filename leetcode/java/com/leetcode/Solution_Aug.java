package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rensong.pu on 2016/8/3.
 */
public class Solution_Aug {

    /**
     * 199. Binary Tree Right Side View
     */
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    public static void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;              //递归终止条件
        }
        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1); //右子树递归
        rightView(curr.left, result, currDepth + 1);  //左子树递归

    }

    public static void main(String[] args) {
//           MyQueue myQueue = new MyQueue();
//           myQueue.push(1);
//           myQueue.push(2);
//   //        System.out.println(myQueue.peek());
//           System.out.println(myQueue.stack.size());
//           System.out.println(myQueue.peek());
//           System.out.println(myQueue.stack.remove(0));
//           System.out.println(myQueue.peek());
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode2.right = treeNode5;
//        treeNode3.right = treeNode4;
        List<Integer> list = rightSideView(treeNode);
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    /**
     * 232 Implement Queue using Stacks
     * 思路是用两个stack将element反转成queue的入队顺序
     */
    static class MyQueue {

        private Stack<Integer> stack = new Stack<Integer>();

        // Push element x to the back of queue.
        public void push(int x) {
            stack.add(new Integer(x));
        }

        // Removes the element from in front of queue.
        public void pop() {
            stack.remove(0);//删除底部的（队头）
        }

        // Get the front element.
        public int peek() {
            return stack.firstElement();//取stack底部(队头)
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.isEmpty();
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    /**
     * 225 Implement Stack using Queues
     * 这里用LinkedList比ArrayList更高效
     */
    class MyStack {
        private LinkedList<Integer> elements = new LinkedList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            elements.add(new Integer(x));
        }

        // Removes the element on top of the stack.
        public void pop() {
            elements.remove(elements.size() - 1);
        }

        // Get the top element.
        public int top() {
            return elements.get(elements.size() - 1);
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return elements.size() == 0;
        }

    }

}