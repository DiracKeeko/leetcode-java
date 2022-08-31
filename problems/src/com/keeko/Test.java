package com.keeko;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        // int val = 5;
        int val = 7;
        P0035SearchInsertPosition p = new P0035SearchInsertPosition();
        int res = p.searchInsert(nums, val);
        System.out.println(res);
    }
}
