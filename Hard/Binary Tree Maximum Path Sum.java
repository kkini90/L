/*
Given a binary tree, find the maximum path sum.
For this problem, a path is defined as any sequence of nodes from some starting node to any node 
in the tree along the parent-child connections. The path must contain at least one node and does 
not need to go through the root.
For example:
Given the below binary tree,
       1
      / \
     2   3
Return 6.
*/
------------------------------------------------------------------------------------------
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        max = Math.max(max,root.val+left+right);
        return root.val + Math.max(left,right);
    }
    
}
