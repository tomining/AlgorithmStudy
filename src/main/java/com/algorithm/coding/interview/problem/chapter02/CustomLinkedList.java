package com.algorithm.coding.interview.problem.chapter02;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: 2.1
 * 다음의 비정렬 연결 리스트에서 중복 문자를 제거하는 코드를 작성하라
 * 임시 버퍼가 허용되지 않는 상황에서 이 문제를 어떻게 해결할 수 있겠는가?
 *
 * 참고: https://youtu.be/FEYl8kotwts
 * @author tomining
 */
public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(Node item) {
        this.head = item;
    }

    public void add(Node item) {
        Node temp = this.getHead();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(item);
    }

    public void print() {
        Node temp = this.getHead();
        while (temp != null) {
            System.out.println(temp.getVal());
            temp = temp.getNext();
        }
    }

    public void deleteDuplicated() {
        Node prev = null;

        Map<Integer, Boolean> tempMap = new HashMap<Integer, Boolean>();
        for (Node cur = this.getHead(); cur != null; cur = cur.getNext()) {
            if (tempMap.containsKey(cur.getVal())) {
                prev.setNext(cur.getNext());
            } else {
                tempMap.put(cur.getVal(), true);
                prev = cur;
            }
        }
    }

    public Node getHead() {
        return head;
    }
}

