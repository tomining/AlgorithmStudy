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
public class IsUniqueCharsTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {"abcd", true},
                {"abad", false}
        });
    }

    private String str;
    private boolean isUnique;

    public IsUniqueCharsTest(String str, boolean isUnique) {
        this.str = str;
        this.isUnique = isUnique;
    }

    private IsUniqueChars isUniqueChars = new IsUniqueChars();

    @Test
    public void 유니크_체크() {
        assertEquals(isUnique, isUniqueChars.isUniqueChars(str));
    }
}