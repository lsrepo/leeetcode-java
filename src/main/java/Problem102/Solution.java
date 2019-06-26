package Problem102;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return ans;
        }
        List<TreeNode> current = new ArrayList<>();

        current.add(root);
        while (!current.isEmpty()){
            List<Integer> l = new ArrayList<>();
            for (TreeNode node:current) {
                l.add(node.val);
            }
            ans.add(l);
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node:current) {
                if (node.left != null){
                    next.add(node.left);
                }
                if (node.right != null){
                    next.add(node.right);
                }
            }
            current = next;
        }
        return ans;
    }
}