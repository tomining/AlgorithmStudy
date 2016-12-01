package com.algorithm.sort;

import org.apache.commons.lang.ArrayUtils;

/**
 * Question: MergeSort(병합정렬)
 * O(nlogn)
 *
 * @author tomining
 */
public class MergeSort extends AbstractSort {
    protected int[] sorting(int[] nums) {
        if (nums.length > 1) {
            int midIdx = nums.length / 2;
            int[] leftNums = ArrayUtils.subarray(nums, 0, midIdx);
            int[] rightNums = ArrayUtils.subarray(nums, midIdx, nums.length);

            leftNums = sorting(leftNums);
            rightNums = sorting(rightNums);

            int leftSize = leftNums.length;
            int rightSize = rightNums.length;
            int lIdx = 0;
            int rIdx = 0;

            while (true) {
                if (lIdx < leftSize && rIdx < rightSize) {
                    if (leftNums[lIdx] < rightNums[rIdx]) {
                        nums[lIdx + rIdx] = leftNums[lIdx];
                        lIdx++;
                    } else {
                        nums[lIdx + rIdx] = rightNums[rIdx];
                        rIdx++;
                    }
                } else if (lIdx < leftSize) {
                    nums[lIdx + rIdx] = leftNums[lIdx];
                    lIdx++;
                } else if (rIdx < rightSize) {
                    nums[lIdx + rIdx] = rightNums[rIdx];
                    rIdx++;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
}
