package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author tomining
 */
public abstract class AbstractSort implements Sort {
    public int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        System.out.print(Arrays.toString(nums));
        nums = sorting(nums);
        System.out.println(" ==> " + Arrays.toString(nums));
        return nums;
    }

    protected abstract int[] sorting(int[] nums);
}
