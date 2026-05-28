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
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
    boolean inorder(TreeNode root){
        if(root==null){      // if root node is not exist that case tree is valid 
            return true;
        }
        if(!inorder(root.left)){          // check for left subbtree;
            return false;
        } 
        if(prev!=null && prev.val>=root.val){            // current value check;
            return false;
        }
        prev=root;    // now current root has become prev 
        return inorder(root.right);      // after leftsubtree check for right subtree 

    }
}

A BST is   [left < root < right]
Input: root = [2,1,3]
Output: true
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
