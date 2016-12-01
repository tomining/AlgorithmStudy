package com.algorithm.sort;

import java.util.Arrays;

/**
 * Question: InsertionSort(삽입정렬)
 * O(n^2)
 *
 * @author tomining
 */
public class InsertionSort extends AbstractSort {
    @Override
    protected int[] sorting(int[] nums) {
        int size = nums.length;
        int value = 0;
        int temp = 0;
        for(int i = 0; i < size; i++) {
            int j = i;
            value = nums[i];

            while (j > 0 && nums[j-1] > value) {
                swap(nums, j - 1, j);
                j -= 1;
            }
        }

        return nums;
    }
}
