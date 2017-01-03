package com.algorithm.coding.dojang;

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
public class NCounterTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {1, 10, 8, 1},
                {1, 100, 8, 20},
                {1, 1000, 8, 300},
                {1, 10000, 8, 4000}
        });
    }

    private int from;
    private int to;
    private int findNum;
    private int expectedCount;

    public NCounterTest(int from, int to, int findNum, int expectedCount) {
        this.from = from;
        this.to = to;
        this.findNum = findNum;
        this.expectedCount = expectedCount;
    }

    @Test
    public void 숫자_세기() {
        NCounter counter = new NCounter(this.findNum);
        assertEquals(this.expectedCount, counter.countN(from, to));
    }

    @Test
    public void 숫자_세기_10의_배수인_경우() {
        NCounter counter = new NCounter(this.findNum);
        assertEquals(this.expectedCount, counter.countN(to));
    }
}