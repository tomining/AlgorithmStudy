package com.algorithm.coding.interview.problem.chapter01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * @author tomining
 */
@RunWith(Parameterized.class)
public class AnagramTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
            {"listen", "silent", true},
            {"abc", "cbd", false}
        });
    }

    private String str1;
    private String str2;
    private boolean result;

    public AnagramTest(String str1, String str2, boolean result) {
        this.str1 = str1;
        this.str2 = str2;
        this.result = result;
    }

    private Anagram anagram = new Anagram();

    @Test
    public void 아나그램_테스트() {
        assertEquals(result, anagram.isAnagram(str1, str2));
    }

    @Test
    public void 아나그램_테스트2() {
        assertEquals(result, anagram.isAnagram2(str1, str2));
    }
}