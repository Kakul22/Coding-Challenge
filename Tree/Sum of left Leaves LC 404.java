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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null && root.left.left==null &&root.left.right==null){
            sum+= root.left.val;

        }
        
        return sum+=sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        
    }
}






A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

        3
       / \
      9   20
         /  \
        15   7
// Input: root = [3,9,20,null,null,15,7]
// Output: 24
// Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
