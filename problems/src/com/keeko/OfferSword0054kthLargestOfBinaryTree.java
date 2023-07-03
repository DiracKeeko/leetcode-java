package com.keeko;

public class OfferSword0054kthLargestOfBinaryTree {
    private int num = 0;

    public int kthLargest(TreeNode root, int k) {
        return getNodeVal(root, k);
    }

    private int getNodeVal(TreeNode root, int k) {
        if (root == null) {
            return -1; // 或者根据需求返回适当的默认值
        }

        int right = getNodeVal(root.right, k);
        if (right != -1) {
            return right;
        }

        num++;
        if (num == k) {
            return root.val;
        }

        return getNodeVal(root.left, k);
    }
}
