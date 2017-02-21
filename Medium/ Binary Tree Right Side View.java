/*
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered 
from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightSideView(root,result,0);
        return result;
    }
    
    private void rightSideView(TreeNode root,List<Integer> result,int level){
        if(root == null){
            return;
        }
        if(level == result.size()){
            result.add(root.val);
        }
        rightSideView(root.right,result,level+1);
        rightSideView(root.left,result,level+1);
    }
}
