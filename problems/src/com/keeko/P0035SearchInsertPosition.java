package com.keeko;

/**
 * https://leetcode.com/problems/search-insert-position/description/
 * Difficulty:Easy
 * <p>
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */


/*
   写出了所有可能性的笨比解法
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
    Memory Usage: 43.2 MB, less than 68.74% of Java online submissions for Search Insert Position.
* */
public class P0035SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            if (nums[0] < target) {
                return 1;
            }
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (target <= nums[0]) {
                return 0;
            }
            if (nums[n - 1] < target) {
                return n;
            }
            if (nums[i + 1] == target || (nums[i] < target && target < nums[i + 1])) {
                return i + 1;
            }
        }
        return 0;
    }
}
