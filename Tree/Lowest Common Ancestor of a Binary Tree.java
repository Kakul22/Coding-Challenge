/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ||root==p || root==q){
            return root;
        }
        TreeNode left= lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        return left!=null ? left: right;
        
    }
}


        
          3
         / \
        5   1
       / \ / \
      6  2 0  8
        / \
       7   4

p = 5
q = 1
3  
as   3 has both 5 and 1 below it  and it is common ancestor.  
