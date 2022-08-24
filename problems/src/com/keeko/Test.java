package com.keeko;

public class Test {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        P0027RemoveElement p = new P0027RemoveElement();
        int res = p.removeElement(nums, val);
        System.out.println(res);
    }
}
