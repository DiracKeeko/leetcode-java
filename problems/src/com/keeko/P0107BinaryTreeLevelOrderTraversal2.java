package com.keeko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P0107BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        preOrder(root, 0);
        Collections.reverse(res);
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
