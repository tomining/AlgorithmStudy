package com.algorithm.coding.interview.problem.chapter01;

import java.util.Arrays;

/**
 * Question: 1.1
 * 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라.
 * 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
 *
 * 참고: https://youtu.be/piDwgBqmqKM
 * @author tomining
 */
public class IsUniqueChars {
    public boolean isUniqueChars(String str) {
        return isUniqueChars(str, 256);
    }

    public boolean isUniqueChars(String str, int totalUniqueCharCount) {
        boolean[] hash = new boolean[totalUniqueCharCount];
        Arrays.fill(hash, false);   //false로 초기화

        for (char ch: str.toCharArray()) {
            if (hash[ch] == true) { //이미 존재하는 문자인 경우
                return false;
            } else {
                hash[ch] = true;
            }
        }

        return true;
    }
}
