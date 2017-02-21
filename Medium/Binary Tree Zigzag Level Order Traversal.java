/*
Given a binary tree, return the zigzag level order traversal of its nodes' values. 
(ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/
---------------------------------------------------------------------------
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
     List<List<Integer>> result = new ArrayList<>();
     travel(root,result,0);
     return result;
    }
    private void travel(TreeNode curr, List<List<Integer>> result, int level){
        if(curr ==null){
            return;
        }
        if(result.size()<=level){
            List<Integer> newLevel = new LinkedList<>();
            result.add(newLevel);
        }
        List<Integer> collection = result.get(level);
        if(level%2 ==0){
            collection.add(curr.val);
        }else{
            collection.add(0,curr.val);
        }
        travel(curr.left,result,level+1);
        travel(curr.right,result,level+1);
    }
}
