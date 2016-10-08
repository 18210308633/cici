package com.Collections;

/**
 * 左神在牛客网直播的一道题
 * 意思大致如下：单链表，有环则返回第一个入环节点否则返回null。
 * 两个单链表，如果相交返回第一个相交节点
 * Created by thinkpad on 2016/8/24.
 */
public class LoopNode {
    //获取单链表有环的第一个入环节点
    //不需要额外的空间(hash表)
    public Node getLoop(Node root) {
        Node node = root;
        //用快慢指针，数学可证明，有环长度N,无环长度M
        Node fast = root;
        Node slow = root;
        return node;
    }

    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
