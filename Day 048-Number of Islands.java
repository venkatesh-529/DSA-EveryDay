class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] v=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) if(grid[i][j]=='1' && !v[i][j]) {
                infect(grid,v,i,j);
                c++;
            }
        }
        return c;
    }
    public static void infect(char[][] g,boolean[][] v,int i,int j){
        //c=c+1;
        int r=g.length;
        int c1=g[0].length;
        if(i<0 || j<0 || i>=r || j>=c1) return;
        if(v[i][j]) return;
        if(g[i][j]=='0') return;
        v[i][j]=true;
        infect(g,v,i-1,j);
        infect(g,v,i,j+1);
        infect(g,v,i+1,j);
        infect(g,v,i,j-1);
    }
}