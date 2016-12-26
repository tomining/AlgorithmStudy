package com.algorithm.coding.interview.problem.chapter01;

import java.util.Stack;

/**
 * Question: 1.2
 * 널 문자로 끝나는 문자열을 뒤집는 reverse(char* str) 함수를 C나 C++로 구현하라
 *
 * 참고: https://youtu.be/7yMk8tnHWHU
 * @author tomining
 */
public class ReverseString {
    public String reverse(String str) {
        String result = "";

        Stack<Character> stack = new Stack<Character>();
        for (char ch: str.toCharArray()) {
            stack.push(ch);
        }

        while (stack.empty() == false) {
            result += stack.pop();
        }

        return result;
    }
}
