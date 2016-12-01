package com.algorithm.sort;

/**
 * Question: QuickSort(퀵정렬)
 * O(nlogn)
 *
 * @author tomining
 */
public class QuickSort extends AbstractSort {
    protected int[] sorting(int[] nums) {
        return sorting(nums, 0, nums.length - 1);
    }

    private int[] sorting(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }

        int leftIdx = start;
        int rightIdx = end;
        int pivotIdx = leftIdx++;

        while (leftIdx <= rightIdx) {
            if (nums[leftIdx] < nums[pivotIdx]) {
                leftIdx++;
            } else if (nums[rightIdx] > nums[pivotIdx]) {
                rightIdx--;
            } else {
                swap(nums, leftIdx++, rightIdx--);
            }
        }

        swap(nums, leftIdx -1, pivotIdx);

        sorting(nums, start, leftIdx - 2);
        sorting(nums, leftIdx, end);

        return nums;
    }
}
