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
public class SelfNumberTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {1, 10, 25},
                {1, 31, 76},
                {1, 5000, 1227365}
        });
    }

    private int from;
    private int to;
    private int sum;

    public SelfNumberTest(int from, int to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    private SelfNumber selfNumber = new SelfNumber();

    @Test
    public void SelfNumber_테스트() {
        int result = selfNumber.sumUpSelfNumber(this.from, this.to);
        assertEquals(sum, result);
    }
}