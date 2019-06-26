package Problem98;

import common.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, Integer minVal, Integer maxVal) {
        if (root == null) return true;

        if( (maxVal != null && root.val >= maxVal) || (minVal != null && root.val <= minVal)) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}