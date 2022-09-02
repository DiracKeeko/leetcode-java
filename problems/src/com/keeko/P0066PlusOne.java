package com.keeko;

// Easy   38%

// Given a non-negative integer represented as a non-empty array of digits, plus
// one to the integer.

// You may assume the integer do not contain any leading zero, except the number
// 0 itself.

// The digits are stored such that the most significant digit is at the head of
// the list.

    /*
    Input: digits = [1,2,3]
    Output: [1,2,4]


    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    */

/*

    Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    Memory Usage: 41.9 MB, less than 82.99% of Java online submissions for Plus One.

*/

public class P0066PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        // 如果全是9, 则不会从for循环里return
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }
}
