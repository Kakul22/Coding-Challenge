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
    int count=0;            // kitne nodes visit kar chuke hain    as inorder traversal gives sorted order 
    int ans=0;          // store final ans;
    public int kthSmallest(TreeNode root, int k){
        inorder(root,k);
        return ans;
    }
    void inorder( TreeNode root, int k){
        if(root==null){
            return ;
        }
        inorder(root.left,k);            // first visit left subtree 
        count++;
        if(count==k){            
            ans=root.val;
            return ;
        }
        inorder(root.right,k);           // then visit right subtree 
    }
}




Input: root = [3,1,4,null,2], k = 1
Output: 1
