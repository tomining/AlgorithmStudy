package com.algorithm.coding.interview.problem.chapter02;

/**
 * @author tomining
 */
class Node {
    private final int val;
    private Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
