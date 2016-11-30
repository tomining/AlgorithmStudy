package com.algorithm.sort;

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
public class InsertionSortTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {1, 2, 3, 4, 5, 6}, new int[] {4, 6, 1, 3, 5, 2}},
                {new int[] {1, 2, 3, 4, 5, 6}, new int[] {6, 4, 3, 1, 2, 5}},
                {new int[] {1, 2, 3, 4, 5, 6}, new int[] {6, 5, 4, 3, 2, 1}}
        });
    }

    public int[] expectedSortedNumbers;
    public int[] numbers;

    public InsertionSortTest(int[] expectedSortedNumbers, int[] numbers) {
        this.expectedSortedNumbers = expectedSortedNumbers;
        this.numbers = numbers;
    }

    private Sort sortEngine = new InsertionSort();

    @Test
    public void test() throws Exception {
        assertArrayEquals(expectedSortedNumbers, sortEngine.sort(numbers));
    }
}