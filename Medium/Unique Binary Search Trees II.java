/*
Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.

For example,
Given n = 3, your program should return all 5 unique BST's shown below.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
*/
---------------------------------------------------------------------------------------------------------
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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList();
        }
        return generateSubTrees(1,n);
    }
    private static List<TreeNode> generateSubTrees(int s,int e){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(s>e){
            res.add(null);
            return res;
        }
        
        for(int i=s;i<=e;i++){
            List<TreeNode> leftTree = generateSubTrees(s,i-1);
            List<TreeNode> rightTree = generateSubTrees(i+1,e);
            
            for(TreeNode left : leftTree){
                for(TreeNode right : rightTree){
                TreeNode root = new TreeNode(i);
                root.left = left;
                root.right = right;
                res.add(root);
                }
            }
        }
        return res;
    }
}
