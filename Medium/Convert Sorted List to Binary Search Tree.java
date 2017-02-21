/*
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
*/
------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    
    private ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode  runner = head;
        node = head;
        int size = 0;
        
        while(runner!=null){
            runner = runner.next;
            size++;
        }
        
        return inorderHelper(0,size-1);
    }
    
    private TreeNode inorderHelper(int start,int end){
        if(start>end){
            return null;
        }
        
        int mid = (start+end)/2;
        TreeNode left = inorderHelper(start,mid-1);
        
         TreeNode treeNode = new TreeNode(node.val);
         treeNode.left =  left;
         node = node.next;
         
         TreeNode right = inorderHelper(mid+1,end);
         treeNode.right = right;
         
         return treeNode;
         
    }
}
