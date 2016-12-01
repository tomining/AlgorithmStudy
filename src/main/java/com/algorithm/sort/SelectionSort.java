package com.algorithm.sort;

import java.util.Arrays;

/**
 * Question: SelectionSort(선택정렬)
 * O(n^2)
 *
 * @author tomining
 */
public class SelectionSort extends AbstractSort {
    @Override
    protected int[] sorting(int[] nums) {
        int minIdx = 0;
        int temp = 0;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            minIdx = i;
            int j = i + 1;

            while (j < size) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
                j += 1;
            }

            if (minIdx != i) {
                swap(nums, minIdx, i);
            }
        }

        return nums;
    }
}
