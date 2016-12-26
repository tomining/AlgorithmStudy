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
public class EncodeSpaceTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
            {"Mr John Smith    ", "Mr%20John%20Smith"}
        });
    }

    private String str;
    private String encodedStr;

    public EncodeSpaceTest(String str, String encodedStr) {
        this.str = str;
        this.encodedStr = encodedStr;
    }

    private EncodeSpace encodeSpace = new EncodeSpace();

    @Test
    public void 공백_인코딩_테스트() {
        assertEquals(encodedStr, encodeSpace.encodeSpace(str));
    }
}