package com.algorithm.sort;

/**
 * Question: SelectionSort(선택정렬)
 * O(n^2)
 *
 * @author tomining
 */
public class SelectionSort {
    public int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

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
                temp = nums[minIdx];
                nums[minIdx] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }
}
