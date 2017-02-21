/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of 
every node never differ by more than 1.
*/
--------------------------------------------------------------------------------
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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MAX_VALUE;
        
    }
    
    int checkHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        
        int leftHeight = checkHeight(root.left);
        if(leftHeight == Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        int rightHeight = checkHeight(root.right);
        if(rightHeight == Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        int maxDiff = leftHeight - rightHeight;
        
        if(Math.abs(maxDiff) >1){
            return Integer.MAX_VALUE;
        }else{
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
}
