package com.keeko;

import java.util.ArrayList;
import java.util.List;

public class P0102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        preOrder(root, 0);
        return res;
    }

    public void preOrder(TreeNode node, int deep) {
        if (node == null) {
            return;
        }
        if (res.size() <= deep) {
            // ↑ 注意是 <=
            res.add(new ArrayList<>());
        }
        List<Integer> curList = res.get(deep);
        curList.add(node.val);
        preOrder(node.left, deep+1);
        preOrder(node.right, deep+1);
    }
}
