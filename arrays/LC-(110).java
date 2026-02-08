class Solution {
    int maxDiff = 0;
    
    public boolean isBalanced(TreeNode root) {
        helper(root, 0);
        return maxDiff <= 1;
    }
    
    int helper(TreeNode node, int depth) {
        if (node == null) return depth;

        int left = helper(node.left, depth + 1);
        int right = helper(node.right, depth + 1);

        // Track the maximum height difference found at any node
        maxDiff = Math.max(maxDiff, Math.abs(left - right));
        
        return Math.max(left, right);
    }
}
