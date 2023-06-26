package com.keeko;

import java.util.ArrayList;
import java.util.List;

public class P0662MaximumWidthOfBinaryTree {
    private List<List<Integer>> arr;

    private void getNodeIndex(TreeNode root, int deep, int index) {
        if (root == null) {
            return;
        }
        if (arr.size() <= deep) {
            arr.add(new ArrayList<>());
        }
        arr.get(deep).add(index);
        long mod = 10000000007L; // 少一个0 -> 1000000007L 都无法通过
        getNodeIndex(root.left, deep + 1, (int) ((index * 2 - 1) % mod));
        getNodeIndex(root.right, deep + 1, (int) ((index * 2) % mod));
    }

    public int widthOfBinaryTree(TreeNode root) {
        arr = new ArrayList<>();
        getNodeIndex(root, 0, 1);

        int max = 1;
        for (int i = 1; i < arr.size(); i++) {
            List<Integer> level = arr.get(i);
            int curLevelWidth = level.get(level.size() - 1) - level.get(0) + 1;
            if (level.size() > 1) {
                max = Math.max(max, curLevelWidth);
            }
        }
        return max;
    }
}
