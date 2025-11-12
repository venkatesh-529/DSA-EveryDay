class Solution {
    public int minFallingPathSum(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                int x=Integer.MAX_VALUE;
                int y=Integer.MAX_VALUE;
                int z=Integer.MAX_VALUE;
                if(j-1>=0) x=mat[i-1][j-1];
                y=mat[i-1][j];
                if(j+1<cols) z=mat[i-1][j+1];
                mat[i][j]+=Math.min(x,Math.min(y,z));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<cols;i++) ans=Math.min(ans,mat[rows-1][i]);
        return ans;
    }
}
