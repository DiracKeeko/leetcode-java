package com.keeko;

import java.util.ArrayList;
import java.util.List;

public class P0103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        preOrder(root, 0);
        return res;
    }

    public void preOrder(TreeNode node, int deep) {
        if (null == node) {
            return;
        }
        if (res.size() <= deep) {
            res.add(new ArrayList<>());
        }
        List<Integer> curList = res.get(deep);
        if (deep % 2 == 0) {
            curList.add(node.val);
        } else {
            curList.add(0, node.val);
        }
        preOrder(node.left, deep + 1);
        preOrder(node.right, deep + 1);
    }
}
