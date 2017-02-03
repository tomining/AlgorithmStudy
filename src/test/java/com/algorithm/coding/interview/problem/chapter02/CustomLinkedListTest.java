package com.algorithm.coding.interview.problem.chapter02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tomining
 */
public class CustomLinkedListTest {
    @Test
    public void 링크드리스트_중복_제거() {
        CustomLinkedList list = new CustomLinkedList(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        list.add(new Node(6));
        list.add(new Node(7));
        list.add(new Node(8));
        list.add(new Node(4));
        list.add(new Node(6));
        list.add(new Node(6));
        list.deleteDuplicated();
        list.print();
    }
}