package com.algorithm.backtracking;

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
public class NQueenProblemTest {
    private int n;
    private int solutionCount;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {1, 1}, {2, 0}, {3, 0}, {4, 2},
                {5, 10}, {6, 4}, {7, 40}, {8, 92},
                {9, 352}, {10, 724}, {11, 2680}, {12, 14200},
//                {13, 73712}, {14, 365596}, {15, 2279184}
        });
    }

    public NQueenProblemTest(int n, int solutionCount) {
        this.n = n;
        this.solutionCount = solutionCount;
    }

    private NQueenProblem problem = new NQueenProblem();

    @Test
    public void NQueen문제_풀어보기() {
        assertEquals(solutionCount, problem.solve(n));
    }
}