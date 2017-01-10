package com.algorithm.distance;

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
public class LevenshteinDistanceTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {"kitten", "sitting", 3}
        });
    }

    private String first;
    private String second;
    private int levenshteinDistance;

    public LevenshteinDistanceTest(String first, String second, int levenshteinDistance) {
        this.first = first;
        this.second = second;
        this.levenshteinDistance = levenshteinDistance;
    }

    private LevenshteinDistance levenshtein = new LevenshteinDistance();

    @Test
    public void getDistanceByRecursive() {
        int i = this.first.length();
        int j = this.second.length();
        int distance = levenshtein.getDistance(this.first, i, this.second, j);
        assertEquals(levenshteinDistance, distance);
    }

    @Test
    public void getDistanceByFullMatrix() {
        int distance = levenshtein.getDistance(this.first, this.second);
        assertEquals(levenshteinDistance, distance);
    }
}