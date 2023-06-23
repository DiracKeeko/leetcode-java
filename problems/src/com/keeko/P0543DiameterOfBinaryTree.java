package com.keeko;


// 二叉树的直径是指树中任意两个节点之间最长路径的长度。 这条路径可能经过也可能不经过根节点 root 。
// 两节点之间路径的长度由它们之间边数表示。
public class P0543DiameterOfBinaryTree {
    private int res;

    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        getHeight(root);
        return res;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        res = Math.max(res, l + r);
        return Math.max(l, r) + 1;
    }
}