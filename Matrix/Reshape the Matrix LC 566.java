class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        if(rows*cols!=r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int idx=i*cols+j;
                ans[idx/c][idx%c]=mat[i][j];
            }
        }
        return ans;

        
    }
}


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
