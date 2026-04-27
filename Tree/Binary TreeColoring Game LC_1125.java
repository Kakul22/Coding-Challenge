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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode tree= find(root,x);
        int l=cnt(tree.left);
        int r=cnt(tree.right);
        int parent= n-l-r-1;
        int max=Math.max(Math.max(l,r),parent);
        return max>n/2;
    }

    public TreeNode find(TreeNode root,int x){
        if(root==null) return null;
        if(root.val==x) return root;
        TreeNode left= find(root.left,x);
        TreeNode right= find(root.right,x);

        if(left==null){
            return right;
        } 
        return left;
    }
    public int cnt(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+cnt(root.left)+cnt(root.right);
    }
}
