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

    protected int[] swap(int[] nums, int i, int j) {
        int size = nums.length;

        if (i < 0 || j < 0 || i > size - 1 || j > size - 1) {
            return nums;
        } else if (i == j) {
            return nums;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }

    protected abstract int[] sorting(int[] nums);
}
