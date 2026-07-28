class Solution {
    public int numTrees(int n) {
        return count(n);
        
    }
    private int count(int n){
        if(n<=1){
            return 1;
        }
        int ans=0;
        for(int root=1;root<=n;root++){  // count both left and right nodes 
            ans+=count(root-1)*count(n-root);  // left subtree = (root-1)nodes & right subtree= (n-root)nodes
        }
        return ans;
    }
}
