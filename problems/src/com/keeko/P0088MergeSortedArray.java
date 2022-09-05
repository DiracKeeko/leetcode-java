package com.keeko;

public class P0088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] sortArr = new int[m + n];
        while (i < m || j < n) {
            if (i == m) {
                sortArr[i + j] = nums2[j];
                j++;
            } else if (j == n) {
                sortArr[i + j] = nums1[i];
                i++;
            } else if (nums1[i] <= nums2[j]) {
                sortArr[i + j] = nums1[i];
                i++;
            } else {
                sortArr[i + j] = nums2[j];
                j++;
            }
        }
        for (int k = 0; k < sortArr.length; k++) {
            nums1[k] = sortArr[k];
        }
    }
}
