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
public class CompressWordTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
            {"aabccccccccaa", "a2b1c8a2"},
            {"abcd", "abcd"}
        });
    }

    private String input;
    private String output;

    public CompressWordTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    private CompressWord compressWord = new CompressWord();

    @Test
    public void 단어_압축_테스트() {
        assertEquals(output, compressWord.compress(input));
    }
}