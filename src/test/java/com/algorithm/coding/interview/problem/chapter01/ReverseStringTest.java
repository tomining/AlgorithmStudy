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
public class ReverseStringTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {"abcd", "dcba"}
        });
    }

    private String str;
    private String reversedStr;

    public ReverseStringTest(String str, String reversedStr) {
        this.str = str;
        this.reversedStr = reversedStr;
    }

    private ReverseString reverseString = new ReverseString();

    @Test
    public void 문자열_뒤집기() {
        assertEquals(reversedStr, reverseString.reverse(str));
    }
}