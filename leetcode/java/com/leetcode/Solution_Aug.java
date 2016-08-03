package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rensong.pu on 2016/8/3.
 */
public class Solution_Aug {
    /**
     * 225 Implement Stack using Queues
     * ������LinkedList��ArrayList����Ч
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


    /**
     * 232 Implement Queue using Stacks
     * ˼·��������stack��element��ת��queue�����˳��
     */
    static class MyQueue {

        private Stack<Integer> stack = new Stack<Integer>();

        // Push element x to the back of queue.
        public void push(int x) {
            stack.add(new Integer(x));
        }

        // Removes the element from in front of queue.
        public void pop() {
            stack.remove(0);//ɾ���ײ��ģ���ͷ��
        }

        // Get the front element.
        public int peek() {
            return stack.firstElement();//ȡstack�ײ�(��ͷ)
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
//        System.out.println(myQueue.peek());
        System.out.println(myQueue.stack.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.stack.remove(0));
        System.out.println(myQueue.peek());

    }

}
