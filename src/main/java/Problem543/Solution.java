package Problem543;


import common.TreeNode;

public class Solution {
    int max = 0;

    public int depth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        int _max = right + left;

        max = Math.max(max, _max);
        return Math.max(right, left) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
}