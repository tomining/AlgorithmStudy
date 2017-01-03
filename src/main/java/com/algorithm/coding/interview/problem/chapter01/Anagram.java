package com.algorithm.coding.interview.problem.chapter01;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

/**
 * Question: 1.3
 * 문자열 두 개를 입력으로 받아 그중 하나가 다른 하나의 순열인지 판별하는 메서드를 작성하라
 *
 * 참고: https://youtu.be/u1EPT8RiNW4
 * @author tomining
 */
public class Anagram {
    public boolean isAnagram(String str1, String str2) {
        return StringUtils.equals(sort(str1.toCharArray()), sort(str2.toCharArray()));
    }

    private String sort(char[] chars) {
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean isAnagram2(String str1, String str2) {
        for (char ch : str1.toCharArray()) {
            if (StringUtils.isEmpty(str2)) {
                return false;
            }

            str2 = str2.replace(ch, ' ');
        }

        return StringUtils.isBlank(str2);
    }
}
