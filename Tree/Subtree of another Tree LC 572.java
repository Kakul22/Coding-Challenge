/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root==null){
            return false;
        }
        if(isSame(root,subRoot)){
            return true;
        }
        return (isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot));
    }
    boolean isSame(TreeNode r,TreeNode t){
        if(r==null&&t ==null){
            return true;
        }
        if(r==null||t==null){
            return false;
        }
        if(r.val!=t.val){
            return false;
        }
        return isSame(r.left, t.left)&&isSame(r.right,t.right);
    }
}
