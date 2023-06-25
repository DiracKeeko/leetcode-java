package com.keeko;

public class P0222CountCompleteTreeNodes {
    private int res;

    public int countNodes(TreeNode root) {
        res = 0;
        getNum(root);
        return res;
    }

    public void getNum(TreeNode root) {
        if (root == null) {
            return;
        }
        res++;
        getNum(root.left);
        getNum(root.right);
    }
}
