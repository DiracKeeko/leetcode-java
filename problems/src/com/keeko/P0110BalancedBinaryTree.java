package com.keeko;


// 平衡二叉树：左右子树的高度差不超过1
public class P0110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) < 10000;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if (Math.abs(l - r) > 1) {
            return 10000;
        }
        return Math.max(l, r) + 1;
    }
}
