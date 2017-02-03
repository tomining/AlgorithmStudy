package com.algorithm.coding.dojang;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author tomining
 */
public class EmployeeCounterTest {
    private List<String> commutingTime = new ArrayList<String>() {
        {
            add("09:12:23 11:14:35");
            add("10:34:01 13:23:40");
            add("10:34:31 11:20:10");
        }
    };

    private EmployeeCounter counter = new EmployeeCounter();

    @Test
    public void compareTest() {
        long count = counter.countWorkingEmployees(commutingTime.stream(), "11:05:20");
        assertEquals(3, count);
    }
}