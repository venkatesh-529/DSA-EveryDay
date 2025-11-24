class Solution {
        int c,v;
        public Solution(){
            c=0;
            v=0;
        }
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int i=0,j=0;
        int si=-1,sj=-1,ei=-1,ej=-1;
        for( i=0;i<m;i++){
            for( j=0;j<n;j++) {
                if(grid[i][j]==1){si=i;sj=j;} 
                if(grid[i][j]==2){ei=i;ej=j;}
                if(grid[i][j]!=-1) v++;
            }
        }
        boolean vis[][]=new boolean[m][n];
        backtrack(grid,vis,si,sj, ei, ej,m,n,1);
        return c;
    }
    public void backtrack(int[][] g,boolean[][] vis,int i,int j,int d1,int d2,int m,int n,int t){
        if(i<0 || j<0||i==m ||j==n||g[i][j]==-1 || vis[i][j]) return;
        if(i==d1 && j==d2){
            if(v==t) c++;
            return;
        }
        vis[i][j]=true;
        backtrack(g,vis,i+1,j, d1, d2,m,n,t+1);
        backtrack(g,vis,i,j+1, d1, d2,m,n,t+1);
        backtrack(g,vis,i-1,j, d1, d2,m,n,t+1);
        backtrack(g,vis,i,j-1, d1, d2,m,n,t+1);
        vis[i][j]=false;
    }
}