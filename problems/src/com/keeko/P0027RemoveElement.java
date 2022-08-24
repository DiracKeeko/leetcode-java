package com.keeko;


/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty:Easy
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */

public class P0027RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            if (nums[l] == val) {
                nums[l] = nums[r - 1];
                r--;
            } else {
                l++;
            }
        }
        return l;
    }
}
