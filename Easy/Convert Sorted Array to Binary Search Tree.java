/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    
    TreeNode sortedArrayToBST(int[] nums,int start,int end){
        if(start > end){
            return null;
        }
        
        int mid  = (start + end)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = sortedArrayToBST(nums,start,mid-1);
        n.right = sortedArrayToBST(nums,mid+1,end);
        return n;
    }
}
