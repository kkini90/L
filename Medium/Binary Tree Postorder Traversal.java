/*
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if(root!=null){
            stack1.push(root);
        }
        
        while(!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if(temp.left != null){
                stack1.push(temp.left);
            }
            if(temp.right != null){
                stack1.push(temp.right);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        while(!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}
