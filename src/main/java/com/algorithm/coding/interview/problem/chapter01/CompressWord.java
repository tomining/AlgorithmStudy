package com.algorithm.coding.interview.problem.chapter01;

/**
 * Question: 1.5
 * 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라.
 * 가령 압축해야 할 문자열이 aabccccccccaa라면 a2b1c8a3과 같이 압축되어야 한다.
 * 압축 결과로 만들어지는 문자열이 원래 문자열보다 짧아지지 않는 경우, 이 메서드는 원래 문자열 그대로 반환해야 한다.
 *
 * 참고: https://youtu.be/y4-t0bzAB6o
 * @author tomining
 */
public class CompressWord {
    public String compress(String input) {
        String output = "";
        char buffer = ' ';
        int count = 1;

        for (char ch: input.toCharArray()) {
            if (buffer == ' ') {    //버퍼가 초기값인 경우
                buffer = ch;
                output += ch;
            } else if (buffer == ch) { //버퍼 문자와 같은 경우 count + 1
                count++;
            } else {    //버퍼와 다른 문자인 경우
                output += count;    //이전 문자 갯수 output에 추가
                buffer = ch;    //신규 문자를 버퍼에 저장
                count = 1;      //count 값 초기화
                output += buffer;   //버퍼 문자 output에 추가
            }
        }
        output += count;    //마지막 문자 갯수 저장

        if (output.length() > input.length()) {
            return input;
        } else {
            return output;
        }
    }
}
