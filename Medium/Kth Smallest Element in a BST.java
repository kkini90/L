/*
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? 
How would you optimize the kthSmallest routine?
*/
------------------------------------------------------------------------
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
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if(k<=count){
            return kthSmallest(root.left,k);
        }else if(k>count+1){
            return kthSmallest(root.right,k-1-count);
        }
        return root.val;
    }
    
    private static int countNodes(TreeNode n){
        if(n==null){
            return 0;
        }
        return 1+countNodes(n.left)+countNodes(n.right);
    }
}
