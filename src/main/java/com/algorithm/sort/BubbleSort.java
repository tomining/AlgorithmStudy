package com.algorithm.sort;

import java.util.Arrays;

/**
 * Question: BubbleSort(거품정렬)
 * O(n^2)
 *
 * @author tomining
 */
public class BubbleSort {
    public int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        System.out.print(Arrays.toString(nums));
        int size = nums.length;
        int temp = 0;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println(" ==> " + Arrays.toString(nums));
        return nums;
    }
}
