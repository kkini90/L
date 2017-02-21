/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
*/
------------------------------------------------------------------------------------------------
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
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root!=null){
            if(isLeaf(root.left)){
                res+=root.left.val;
            }else{
                res+=sumOfLeftLeaves(root.left);
            }
            res+=sumOfLeftLeaves(root.right);
        }
        return res;
    }
    private static boolean isLeaf(TreeNode root){
        if(root == null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
}
