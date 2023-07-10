package com.keeko;

import java.util.List;

public class P0230KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return res;
    }

    public int num = 0;
    public int res = 0;
    public void inOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inOrder(root.left, k);
        num ++;
        if (num == k) {
            res = root.val;
            return;
        }
        inOrder(root.right, k);
    }
}
